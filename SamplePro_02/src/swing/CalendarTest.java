package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalendarTest implements ActionListener {

	JFrame f;
	JComboBox cbY, cbM, cbD;
	JButton btn;
	JLabel la;

	Integer[] strY = new Integer[11];
	Integer[] strM = new Integer[12];
	Integer[] strD = new Integer[31];

	int[] lastDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	Calendar cal = Calendar.getInstance();

	CalendarTest() {
		f = new JFrame("요일 계산 실습");
		// 월
		for (int i = 0; i < 12; i++) {
			strM[i] = i + 1;
		}
		// 년도: 올해년도에서 -5년부터 +5년까지 출력
		for (int i = 0, y = 2013; i < 11; i++, y++) {
			strY[i] = y;
		}
		cbY = new JComboBox(strY);
		cbM = new JComboBox(strM);
		cbD = new JComboBox();
		btn = new JButton("▶");
		la = new JLabel("");

		setDay();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		cbY.setSelectedItem(year);
		cbM.setSelectedItem(month);
		cbD.setSelectedItem(day);

	}

	void addLayout() {
		JPanel pCenter = new JPanel();

		pCenter.add(cbY);
		pCenter.add(new JLabel("년"));
		pCenter.add(cbM);
		pCenter.add(new JLabel("월"));
		pCenter.add(cbD);
		pCenter.add(new JLabel("일"));
		pCenter.add(btn);
		pCenter.add(la);

		f.setLayout(new BorderLayout());
		f.add(pCenter, BorderLayout.CENTER);

		f.setSize(500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	void eventProc() {
		cbY.addActionListener(this);
		cbM.addActionListener(this);
		cbD.addActionListener(this);
		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object evt = e.getSource();
		if (evt == cbM || evt == cbY) {
			setDay();
		}
		if (evt == btn) {
			setDate();
		}
	}

	void setDay() {
		// 윤년 구해서
		int year = (int) cbY.getSelectedItem();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			lastDays[1] = 29;
		} else {
			lastDays[1] = 28;
		}
		// 선택한 월값을 얻어오기
		int month = cbM.getSelectedIndex();
		cbD.removeAllItems();
		for (int i = 1; i <= lastDays[month]; i++) {
			cbD.addItem(i);
		}

	}

	void setDate() {
		int year = (int) cbY.getSelectedItem();
		int month = (int) cbM.getSelectedItem();
		int day = (int) cbD.getSelectedItem();

		cal.set(year, month - 1, day);

		int datenum = cal.get(Calendar.DAY_OF_WEEK);
		String dayofweek = null;
		switch (datenum) {
		case 1:
			dayofweek = "일요일";
			break;
		case 2:
			dayofweek = "월요일";
			break;
		case 3:
			dayofweek = "화요일";
			break;
		case 4:
			dayofweek = "수요일";
			break;
		case 5:
			dayofweek = "목요일";
			break;
		case 6:
			dayofweek = "금요일";
			break;
		case 7:
			dayofweek = "토요일";
			break;

		default:
			break;

		}
		la.setText(dayofweek);
		// System.out.println(">>"+la.getText());
	}

	public static void main(String[] args) {
		CalendarTest cal = new CalendarTest();
		cal.addLayout();
		cal.eventProc();
	}

}