package awt;

import java.awt.Frame;

public class MyPro2 extends Frame {

	//is-a
	public MyPro2(){
		super("나의 첫화면");
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {

		MyPro2 f = new MyPro2();
	}

}
