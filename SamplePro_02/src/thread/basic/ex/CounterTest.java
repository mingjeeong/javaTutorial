package thread.basic.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CounterTest extends JFrame {
	private JPanel p1, p2;
	private JButton btn1;
	private JTextArea res;
	private JLabel lb;
	private boolean inputChk;

	public CounterTest() {
		setTitle("단일 스레드 테스트!");

		p1 = new JPanel();
		p1.add(btn1 = new JButton("Click"));
		p1.add(lb = new JLabel("Count!"));// 추가
		add(p1, "North");

		p2 = new JPanel();
		res = new JTextArea(20, 50);
		p2.add(res);
		add(p2);

		setBounds(200, 200, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 코드 줄여서 쓰기
				new Thread(new Runnable() {
					public void run() {
						for (int i = 0; i < 10; i++) {
							if (inputChk) {
								lb.setText("멈춤");
								inputChk = false;
								return;
							}
							lb.setText(String.valueOf(i));
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}

				}).start();

				new Thread(new Runnable() {
					public void run() {
						String name = JOptionPane.showInputDialog("이름을 입력하시오");
						res.append(name + "님 접속완료");
						inputChk = true;
					}
				}).start();

				//버튼 10초안에 안누르면 폭탄 터지는 그림으로 바꾸기
			}
		});
	}

	public static void main(String[] args) {
		new CounterTest();
	}
}
