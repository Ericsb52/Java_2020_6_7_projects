package blockbreaker;

import javax.swing.JFrame;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("block Breaker");//1
		
		BlockBreaker panel = new BlockBreaker();
		
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//2
		
		frame.setVisible(true);//3
		frame.setSize(500,600);//4
		frame.setResizable(false);
		
	}

}
