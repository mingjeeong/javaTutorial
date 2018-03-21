package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalTest implements ActionListener{
	JFrame f;
	JTextArea tf;
	JButton[] b = new JButton[10];
	JButton bPlus;
	JButton bEqual;
	JButton bMinus;
	JButton bMul;
	JButton bDivide;
	int result;
	
	
	int num1=0;
	int num2=0;
	char op=' ';

	CalTest(){
		f = new JFrame("계산기 만들기 실습");
		tf = new JTextArea(10,50);
		for(int i = 0; i < b.length;i++){
			b[i] = new JButton(i+"");
		}
		bPlus = new JButton("+");
		bEqual = new JButton("=");
		bMinus = new JButton("-");
		bMul = new JButton("*");
		bDivide = new JButton("/");
		
		
	}
	
	void addLayout(){
		JPanel pNorth = new JPanel();
		pNorth.add(tf);
		
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(5, 3));
		for(int i = 1 ; i < b.length ; i++){
			pCenter.add(b[i]);
		}
		pCenter.add(bPlus);
		pCenter.add(b[0]);
		pCenter.add(bEqual);
		pCenter.add(bMinus);
		pCenter.add(bMul);
		pCenter.add(bDivide);
		
		f.setLayout(new BorderLayout());
		f.add(pNorth, BorderLayout.NORTH);
		f.add(pCenter, new BorderLayout().CENTER);
	
	
		f.setSize(800, 600);
		f.setVisible(true);
	}
	
	void eventProc(){
		for(int i = 0 ; i <b.length;i++){
			b[i].addActionListener(this);
		}
		
		bDivide.addActionListener(this);
		bEqual.addActionListener(this);
		bMul.addActionListener(this);
		bMinus.addActionListener(this);
		bPlus.addActionListener(this);
	}
	

	
	
	public static void main(String[] args) {
		CalTest c =  new CalTest();
		c.addLayout();
		c.eventProc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton bb = (JButton)e.getSource();
		for(int i = 0; i < b.length; i++){
			if(bb == b[i]){
				String su = b[i].getText();
				tf.setText(su);
				System.out.println(su);
			}
		}
		
		if(bb == bPlus){
			num1 = Integer.parseInt(tf.getText());
			op = bPlus.getText().charAt(0);//'+'
		}else if(bb == bMinus){
			num1 = Integer.parseInt(tf.getText());
			op = bMinus.getText().charAt(0);
		}else if(bb == bMul){
			num1 = Integer.parseInt(tf.getText());
			op = bMul.getText().charAt(0);
		}else if(bb == bDivide){
			num1 = Integer.parseInt(tf.getText());
			op = bDivide.getText().charAt(0);
		}else if( bb == bEqual){
			num2 = Integer.parseInt(tf.getText());
			
			switch (op) {
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			default:
				break;
			}
			
			System.out.println(result);
			tf.setText(result+"");
		}
	}
		
	

}
