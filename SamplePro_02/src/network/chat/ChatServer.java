package network.chat;

import java.io.*;
import java.util.*;
import java.net.*;

public class ChatServer implements Runnable {
	ArrayList vc = new ArrayList();

	public void run() {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1234);
		} catch (Exception e) {
			System.out.println(e);
		}

		while (true) {
			try {
				Socket s = ss.accept();
				System.out.println("Client 가 접속시도 :" + s);
				ChatService cs = new ChatService(s);
				cs.start();
				vc.add(cs);

			} catch (Exception e) {
			}
		}
	} // run ends

	public static void main(String[] arg) {
		ChatServer cs = new ChatServer();
		new Thread(cs).start();
	}

	class ChatService extends Thread {
		String myname = "quest";
		BufferedReader in;
		OutputStream out;

		ChatService(Socket s) {
			try {
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			} catch (Exception e) {
			}
		}// 생성자 종료

		public void run() {
			while (true) {
				try {
					String msg = in.readLine();
					if (msg == null)
						return;
					StringTokenizer st = new StringTokenizer(msg);
					if (st.countTokens() > 1) {// 두단어 이상이 되었을때
						String temp = st.nextToken();

						// 이름바꾸기
						if (temp.equalsIgnoreCase("/name")) {// 대소문자 무시
							temp = st.nextToken();
							putMessageAll(myname + "님의 이름이 " + temp + "으로 바뀌었습니다.");

							myname = temp;
							changeList();
							continue;
							
						} else if (temp.equals("/enter")) {//입장하기
							myname = st.nextToken();
							putMessageAll(myname + "님이 입장하셨습니다.");
							// 멤버 리스트를 전송하는 함수
							changeList();
							continue;
						}else if(temp.equals("/exit")){//클라이언트 종료시
							putMessageAll(myname+"님이 나갔습니다");
							vc.remove(this);
							changeList();
							continue;
						}

					}

					putMessageAll(myname + ">" + msg);

				} catch (Exception ex) {
					return;
				}

			}
		}// run ends

		// 모든 클라이언트의 별칭들을 전송
		void changeList() {// /member 사용자1 사용자2 사용자3 \n
			String msg = "/member ";
			for (int i = 0; i < vc.size(); i++) {
				ChatService cs = (ChatService) vc.get(i);
				msg += cs.myname + " ";
			}

			putMessageAll(msg);

		}

		void putMessageAll(String msg) {
			for (int i = 0; i < vc.size(); i++) {
				ChatService cs = (ChatService) vc.get(i);

				try {
					cs.putMessage(msg);
				} catch (Exception e) {
					vc.remove(i--);
				}
			}
		} // putMessageAll ends

		void putMessage(String msg) throws Exception {
			out.write((msg + "\r\n").getBytes());
		}

	} // ChatService class ends

}// ChatServer class ends
