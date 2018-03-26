package pos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class pos implements ActionListener {

	JFrame f;

	// menu btn
	JButton[] menuBtn;

	// 결제 버튼
	JButton cashBtn;
	JButton cardBtn;

	// 영수증 출력 버튼
	JButton reciBtn;

	// orderList title label
	JLabel lNo, lName, lPrice, lCount, lTotal;

	// orderList label 5개
	JLabel lorder1, lorder2, lorder3, lorder4, lorder5;

	// 총금액 받은돈 거스름돈 label
	JLabel lTotal1, lTotal2, lMoney1, lMoney2, lChange1, lChange2;
	
	
	public pos() {
		f = new JFrame();

		// 음료 메뉴
		String[] drinkMenu = { "ice아메리카노", "아메리카노", "ice카페라떼", "카페라떼", "ice코코아", "코코아", "ice마끼아또", "마끼아또" };
		menuBtn = new JButton[drinkMenu.length];

		// 메뉴버튼에 지정
		for (int i = 0; i < drinkMenu.length; i++) {
			menuBtn[i] = new JButton(drinkMenu[i]);
		}

		
		cashBtn = new JButton("현금");
		cardBtn = new JButton("카드");
		reciBtn = new JButton("영수증출력");

		// orderList label
		lorder1 = new JLabel("1");
		
		lorder2 = new JLabel("2");
		lorder3 = new JLabel("3");
		lorder4 = new JLabel("4");
		lorder5 = new JLabel("5");

		// JLabel lNo,lName,lPrice,lCount,lTotal;
		lNo = new JLabel("번호");
		lName = new JLabel("품명");
		lPrice = new JLabel("단가");
		lCount = new JLabel("갯수");
		lTotal = new JLabel("총금액");

		// lTotal1,lTotal2,lMoney1,lMoney2,lChange1,lChange2;
		lTotal1 = new JLabel("총금액");
		lTotal2 = new JLabel("");
		lMoney1 = new JLabel("받은금액");
		lMoney2 = new JLabel("");
		lChange1 = new JLabel("거스름돈");
		lChange2 = new JLabel("");
	}

	void addLayout() {
		// 메뉴
		JPanel pMenuList = new JPanel();
		// 카테고리

		// 메뉴
		pMenuList.setLayout(new GridLayout(2, 4));
		for (int i = 0; i < menuBtn.length; i++) {
			pMenuList.add(menuBtn[i]);
		}

		// 주문목록있는 panel
		JPanel pOderList = new JPanel();
		pOderList.setLayout(new BorderLayout());

		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1, 5));
		pNorth.add(lNo);
		pNorth.add(lName);
		pNorth.add(lPrice);
		pNorth.add(lCount);
		pNorth.add(lTotal);

		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(5, 1));
		pCenter.add(lorder1);
		pCenter.add(lorder2);
		pCenter.add(lorder3);
		pCenter.add(lorder4);
		pCenter.add(lorder5);
		pCenter.setBackground(Color.CYAN);
		
		
		
		pOderList.add(pNorth,new BorderLayout().NORTH);
		pOderList.add(pCenter,new BorderLayout().CENTER);

		// 결제총금액 panel
		JPanel pTotal = new JPanel();
		pTotal.setLayout(new GridLayout(3, 2));
		pTotal.add(lTotal1);
		pTotal.add(lTotal2);
		pTotal.add(lMoney1);
		pTotal.add(lMoney2);
		pTotal.add(lChange1);
		pTotal.add(lChange2);

		// 결제 버튼 panel
		JPanel pPayment = new JPanel();
		pPayment.setLayout(new GridLayout(3, 1));
		pPayment.add(cashBtn);
		pPayment.add(cardBtn);
		pPayment.add(reciBtn);

		// 전체 영역 붙이기 panel
		f.setLayout(new GridLayout(2, 2));
		f.add(pOderList);
		f.add(pMenuList);
		f.add(pTotal);
		f.add(pPayment);
		// 화면출력
		f.setSize(800, 600);
		f.setVisible(true);

	}

	void eventProc() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		pos p = new pos();
		p.addLayout();
		p.eventProc();

	}

}
