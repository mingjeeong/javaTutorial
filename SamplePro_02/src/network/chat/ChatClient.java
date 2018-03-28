package network.chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChatClient implements ActionListener, Runnable {
	JFrame f;

	JTextField connTF, sendTF;
	JButton connB, sendB;
	JTextArea ta;

	Socket s;
	BufferedReader in;
	OutputStream out;

	// 추가0 : 대화명을 바꾸기
	JTextField changeNameTF;
	JButton changeNameB;

	// 추가2 : 방인원의 대명 보여주기
	// 변수 선언
	JList memberList;
	Vector list;

	public ChatClient() {
		f = new JFrame("Chat Client");

		connTF = new JTextField();
		sendTF = new JTextField();
		connB = new JButton("접 속");
		sendB = new JButton("확 인");
		ta = new JTextArea(15, 40);

		// 추가0: 대화명 바꾸기
		changeNameTF = new JTextField("guest", 10);
		changeNameB = new JButton("바꾸기");
		JPanel p_changeName = new JPanel();
		p_changeName.add(new JLabel("대화명 : "), "West");
		p_changeName.add(changeNameTF, "Center");
		p_changeName.add(changeNameB, "East");

		JPanel p_serverName = new JPanel();
		p_serverName.setLayout(new BorderLayout());
		p_serverName.add(new JLabel("서버입력 : "), "West");
		p_serverName.add(connTF, "Center");
		p_serverName.add(connB, "East");

		JPanel p_north = new JPanel();
		p_north.setLayout(new GridLayout(1, 2));
		p_north.add(p_changeName);
		p_north.add(p_serverName);

		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(new JLabel("메세지입력 : "), "West");
		p2.add(sendTF, "Center");
		p2.add(sendB, "East");

		// 추가2 : 방인원의 대명 보여주기
		memberList = new JList();
		list = new Vector();
		JPanel p_east = new JPanel();
		p_east.setLayout(new BorderLayout());
		p_east.add("North", new JLabel("   우 리 방 멤 버   "));
		p_east.add("Center", memberList);

		f.getContentPane().add("North", p_north);
		f.getContentPane().add("Center", new JScrollPane(ta));
		f.getContentPane().add("South", p2);
		f.getContentPane().add("East", p_east);

		// f.setSize(500, 300);
		f.pack();
		f.setVisible(true);

		connTF.addActionListener(this);
		connB.addActionListener(this);
		sendTF.addActionListener(this);
		sendB.addActionListener(this);

		// 추가0: 대화명 바꾸기
		changeNameTF.addActionListener(this);
		changeNameB.addActionListener(this);
		
		//x버튼이 눌렀을 때 이벤트
		f.addWindowListener(new WindowListener() {
			
			
			@Override
			public void windowClosing(WindowEvent e) {

				if(s.isConnected()){
					try {
						out.write("/exit bye\n".getBytes());
						in.close();
						out.close();
						s.close();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}// 생성자 종료

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == connTF || o == connB) {
			connProc();
		}

		else if (o == sendTF || o == sendB) {
			sendProc();
		}

		// 추가0: 대화명 바꾸기
		else if (o == changeNameTF || o == changeNameB) {
			changeNameProc();
		}
	} // actionPerformed ends

	void changeNameProc() {
		// JOptionPane.showMessageDialog(null, "변경");
		String changeName = changeNameTF.getText();
		String msg = "/name  " + changeName + "\n";
		try {
			out.write(msg.getBytes());
		} catch (IOException e) {
			System.out.println("이름바꾸기 오류:" + e.getMessage());
			e.printStackTrace();
		}
	}

	void connProc() {
		// JOptionPane.showMessageDialog(null,"접속");

		try {
			// 1.소켓생성(서버아이피,서버포트)
			s = new Socket(connTF.getText(), 1234);

			// 2. 입출력스트림 얻어오기
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 읽기 시작
			Thread th = new Thread(this);
			th.start();// run()호출

			//
			enterRoom();

			ta.setText("접속성공!");
		} catch (Exception e) {
			System.out.println("접속 실패:" + e.getMessage());
			e.printStackTrace();
		}

	} // connProc ends

	void enterRoom() {
		String msg = "/enter " + changeNameTF.getText() + "\n";
		try {
			out.write(msg.getBytes());
		} catch (IOException e) {
			ta.setText("접속후 별명 전송시 오류:" + e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (s.isConnected()) {// 소켓이 연결되있는 동안만 반복문 돌려
			// 서버로부터 데이터 읽어서 화면 출력
			try {
				String msg = in.readLine();

				StringTokenizer st = new StringTokenizer(msg);
				if (st.countTokens() > 1) {
					String temp = st.nextToken();
					// memberList.setListData(null);
					// 멤버들을 리스트 화면에 출력
					if (temp.equals("/member")) {
						list.removeAllElements();
						while (st.hasMoreTokens()) {
							list.add(st.nextToken());
							memberList.setListData(list);
						}
						continue;
					}

				}
				ta.append(msg + "\n");
			} catch (IOException e) {
				System.out.println("읽기 실패:" + e.getMessage());
				e.printStackTrace();
			}
		}
	}

	void sendProc() {
		// JOptionPane.showMessageDialog(null, "보내기");
		String msg = sendTF.getText() + "\n";
		try {
			out.write(msg.getBytes());
			sendTF.setText(null);
		} catch (IOException e) {
			System.out.println("전송오류:" + e.getMessage());
			e.printStackTrace();
		}
	}// sendProc ends

	public static void main(String[] args) {
		new ChatClient();
	}

}// ChatClient ends
