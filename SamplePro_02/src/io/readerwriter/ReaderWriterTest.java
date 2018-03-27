package io.readerwriter;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FileChooserUI;

public class ReaderWriterTest {
	public static void main(String args[]) {
		UIForm3 ui = new UIForm3();
		ui.addLayout();
		ui.eventProc();
	}
}

// ========================================
// 화면을 관리하는 클래스
// ----------------------------------------
class UIForm3 extends JFrame {
	JTextArea ta;
	JButton bSave, bLoad, bClear;
	JScrollPane scroll;

	UIForm3() {
		ta = new JTextArea();
		bSave = new JButton("파일저장");
		bLoad = new JButton("파일읽기");
		bClear = new JButton("화면지우기");
		scroll = new JScrollPane();//추가
		
	}

	void addLayout() {
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		pCenter.add("Center", ta);
		//pCenter.add(scroll);

		JPanel pSouth = new JPanel();
		pSouth.add(bSave);
		pSouth.add(bLoad);
		pSouth.add(bClear);

		getContentPane().add("Center", pCenter);
		getContentPane().add("South", pSouth);

		setSize(400, 350);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void eventProc() {
		EventHandler hdlr = new EventHandler();

		bSave.addActionListener(hdlr);
		bLoad.addActionListener(hdlr);

	}

	class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			Object evt = ev.getSource();

			// "화일저장" 버튼이 눌렸을 때
			if (evt == bSave) {
				JFileChooser fc = new JFileChooser();
				int result = fc.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					// System.out.println(file);

					try {
						FileWriter fw = new FileWriter(file);// 문자저장 통로
						fw.write(ta.getText());

						fw.close();
					} catch (IOException e) {
						System.out.println("저장실패:" + e.getMessage());
						e.printStackTrace();
					}

				}

			} else if (evt == bLoad) {
				JFileChooser fc = new JFileChooser();
				int result = fc.showOpenDialog(null);
				int data =0;
				if (result == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();

					try {
						FileReader fr = new FileReader(file);
						do {
							data = fr.read();
							ta.append(String.valueOf((char)data));

						} while (data != -1);

						fr.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
	}
}