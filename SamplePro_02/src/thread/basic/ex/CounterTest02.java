package thread.basic.ex;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CounterTest02 extends JFrame {
	private JPanel p1, p2;
	private JButton btn1, btn2;
	private JTextArea res;
	private JLabel lb, lb2;
	private boolean inputChk;

	public CounterTest02() {
		setTitle("단일 스레드 테스트!");

		p1 = new JPanel();
		p1.add(btn1 = new JButton("Click"));
		p1.add(btn2 = new JButton("",new ImageIcon("src\\swing\\img\\bump_1.jpg")));
		p1.add(lb = new JLabel("Count!"));
		p1.add(lb2 = new JLabel(""));
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

				new Thread(new Runnable() {
					public void run() {
						for (int i = 0; i < 10; i++) {
							if (inputChk) {
								inputChk = false;
								return;
							}
							if (i == 9) {
								btn2.setIcon(new ImageIcon("src\\swing\\img\\bump_3.jpg"));
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
						btn2.setIcon(new ImageIcon("src\\swing\\img\\bump_2.jpg"));
						lb2.setText("10초안에 입력하세요.");
						String name = JOptionPane.showInputDialog("이름을 입력하시오");
						if (name == null || name.length() == 0 || name.equals("")) {
							res.setText("입력실패");
							btn2.setIcon(new ImageIcon("src\\swing\\img\\bump_3.jpg"));
							inputChk = true;
							return;
						}
						res.append(name + "님 접속완료");
						btn2.setIcon(new ImageIcon("src\\swing\\img\\bump_1.jpg"));
						inputChk = true;
					}
				}).start();

				// 버튼 10초안에 안누르면 폭탄 터지는 그림으로 바꾸기
			}
		});
	}

	public static void main(String[] args) {
		new CounterTest02();
	}
}
