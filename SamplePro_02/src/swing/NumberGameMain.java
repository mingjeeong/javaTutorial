package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NumberGameMain {
	public static void main(String[] args) {
		// 1. 화면 구성
		NumberGameFrame gameFrm = new NumberGameFrame();

		// 2. 랜덤 문자 지정하기
		gameFrm.initChar();

		// 3. 버튼에 문자 보여주기
		gameFrm.showAnswer();
	}
}

class NumberGameFrame extends JFrame implements ActionListener {
	// 1. 화면 구성
	int getsu = 4;
	JButton la[][] = new JButton[getsu][getsu];

	// 2. 버튼에 지정할 문자변수 선언
	char[][] answers = new char[getsu][getsu];

	// 5. 첫번째 선택된 버튼을 저장할 변수와 위치 변수
	JButton firstClick = null;
	int firstRow, firstCol;

	/***********************************************
	 * 1. 화면 구성
	 */
	NumberGameFrame() {

		setLayout(new GridLayout(getsu, getsu));

		for (int row = 0; row < getsu; row++) {
			for (int col = 0; col < getsu; col++) {

				la[row][col] = new JButton();
				add(la[row][col]);

				// 버튼 각각에 이벤트 등록
				la[row][col].addActionListener(this);

				// answers 배열 초기화
				answers[row][col] = '0';
			}
		}

		setSize(300, 300);
		setVisible(true);
	}

	/***********************************************
	 * 2. 문자 지정
	 */
	void initChar() {

		char alpha = '0';

		// 문자를 선택
		BACK: for (int i = 0; i < getsu * getsu;) {
			if (i % 2 == 0) {
				// 임의의 알파벳을 구해서 출력
				alpha = (char) ('A' + (int) (Math.random() * 26));// 0~25
				// System.out.println(alpha);

				// 중복처리
				for (int r = 0; r < getsu; r++) {
					for (int c = 0; c < getsu; c++) {

						if (answers[r][c] == alpha) {
							continue BACK;
						}
					}
				}

			}
			// 위치를 선택
			boolean ok = false;
			do {
				int row = (int) (Math.random() * getsu);// 0 1 2 3
				int col = (int) (Math.random() * getsu);// 0 1 2 3
				if (answers[row][col] == '0') {
					answers[row][col] = alpha;
					ok = true;
					i++;
				}
			} while (!ok);
		}
	}

	/***********************************************
	 * 3. 지정된 문자를 버튼에 보여주기
	 */
	void showAnswer() {

		// 화면에 정답보이기
		for (int row = 0; row < getsu; row++) {
			for (int col = 0; col < getsu; col++) {
				la[row][col].setText(String.valueOf(answers[row][col]));
			}
		}

		
		  //정답 숨기기 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int row = 0; row < getsu; row++) {
			for (int col = 0; col < getsu; col++) {
				la[row][col].setText(null);
			}
		}

	}

	/***********************************************
	 * 4. 이벤트 처리
	 */
	public void actionPerformed(ActionEvent ev) {
		JButton evtBtn = (JButton) ev.getSource();

		for (int i = 0; i < getsu; i++) {
			for (int j = 0; j < getsu; j++) {
				if (evtBtn == la[i][j]) {
					// System.out.println("<" + i + "," + j + ">에 이벤트");

					// 첫번째 선택한 버튼
					if (firstClick == null) {
						firstClick = evtBtn;
						firstRow = i;
						firstCol = j;
						firstClick.setText(String.valueOf(answers[i][j]));
						
						//firstClick.setBackground(new Color(200, 200, 0));// 컴퓨터생상 rgb 255
						
						// firstClick.removeActionListener(this);
					} else {// 두번째 선택한 버튼
						if (firstRow == i && firstCol == j) {
							return;
						}
						
						evtBtn.setText(String.valueOf(answers[i][j]));
						if (answers[firstRow][firstCol] == answers[i][j]) {// 정답인경우
							// JOptionPane.showMessageDialog(null, "정답");
							
//							firstClick.setBackground(new Color(200, 0, 0));
//							evtBtn.setBackground(new Color(200, 0, 0));
							
							firstClick.setEnabled(false);
							evtBtn.setEnabled(false);
							
							// firstClick.addActionListener(this);
						} else {// 정답아닌경우
							// JOptionPane.showMessageDialog(null, "오답");

							firstClick.setText(null);
							evtBtn.setText(null);
						}
						firstClick = null;
					}
				}
			}
		}
	}
}