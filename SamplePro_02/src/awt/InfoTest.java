package awt;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Info {

	//1. 멤버 변수 선언
	JFrame f;

	JTextField tfName;
	JTextField tfTel;
	JTextField tfJumin;
	JTextField tfGender;
	JTextField tfAge;
	JTextField tfHome;

	JTextArea ta;

	JButton bInsert;
	JButton bModify;
	JButton bDelete;
	JButton bShow;
	JButton bExit;

	//2. 생성자 함수(모든 객체 생성)
	Info(){
		f = new JFrame("나의 프로그램");

		tfName = new JTextField();
		tfTel = new JTextField();
		tfJumin = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();

		ta = new JTextArea();

		//		bInsert = new JButton("Insert");


		//		bInsert.setPressedIcon(img1);
		bInsert = new JButton("Insert", new ImageIcon("src\\swing\\img\\1.png"));
		bModify = new JButton("Modify", new ImageIcon("src\\swing\\img\\2.png"));
		bDelete = new JButton("Delete", new ImageIcon("src\\swing\\img\\3.png"));
		bShow = new JButton("Show", new ImageIcon("src\\swing\\img\\4.png"));
		bExit= new JButton("Exit", new ImageIcon("src\\swing\\img\\5.png"));

		bInsert.setRolloverIcon(new ImageIcon("src\\swing\\img\\5.png"));
		bInsert.setPressedIcon(new ImageIcon("src\\swing\\img\\2.png"));
		bInsert.setToolTipText("삽입");
		bInsert.setMnemonic('i'); // 단축키 : alt+i
	}

	//3. 화면구성
	void addLayout(){
		// 왼쪽영역
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(6,2));
		pWest.add(new JLabel("이름"));
		pWest.add(tfName);
		pWest.add(new JLabel("전화번호"));
		pWest.add(tfTel);
		pWest.add(new JLabel("주민번호"));
		pWest.add(tfJumin);
		pWest.add(new JLabel("성별"));
		pWest.add(tfGender);
		pWest.add(new JLabel("나이"));
		pWest.add(tfAge);
		pWest.add(new JLabel("출신지"));
		pWest.add(tfHome);

		// 아래쪽영역
		JPanel pSouth = new JPanel();
		pSouth.add(bInsert);
		pSouth.add(bModify);
		pSouth.add(bDelete);
		pSouth.add(bShow);
		pSouth.add(bExit);


		// 전체 영역 붙이기
		f.setLayout(new BorderLayout());
		f.add(pWest, BorderLayout.WEST);
		f.add(pSouth, BorderLayout.SOUTH);
		f.add(ta, BorderLayout.CENTER);

		// 화면출력
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//이벤트 등록하는 메소드
	void eventProc(){
		//이벤트 핸들러 객체 생성
		MyButton b = new MyButton();
		//이벤트 등록
		bInsert.addActionListener(b);
		bModify.addActionListener(b);
		bDelete.addActionListener(b);
		bShow.addActionListener(b);
		bExit.addActionListener(b);
	}//end of eventProc()


	class MyButton implements ActionListener{

		//이벤트 관련 클래스 - 이벤트 핸들러
		@Override
		public void actionPerformed(ActionEvent e) {
			Object ob = e.getSource();
			if (ob == bInsert) {
				JOptionPane.showMessageDialog(null, "저장");
			} else if (ob == bModify) {
				JOptionPane.showMessageDialog(null, "수정");
			} else if (ob == bDelete) {
				JOptionPane.showMessageDialog(null, "삭제");
			} else if (ob == bShow) {
				JOptionPane.showMessageDialog(null, "보기");
			} else if (ob == bExit) {
				System.exit(0);
			}
		}

	}
}

public class InfoTest {

	public static void main(String[] args) {

		Info info = new Info();
		info.addLayout();
		info.eventProc();
	}

}
