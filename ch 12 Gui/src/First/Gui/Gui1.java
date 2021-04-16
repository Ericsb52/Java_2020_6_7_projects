package First.Gui;
import javax.swing.*;
import java.awt.*;

public class Gui1 {

	public Gui1() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		FlowLayout flowlayout = new FlowLayout();
		
		frame.setLayout(flowlayout);
		frame.setTitle("my first Gui");
		frame.setSize(500,500);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel my_labl = new JLabel("This is a Label");
		my_labl.setText("Changed my Label Text");
		my_labl.setForeground(Color.RED);
		my_labl.setBackground(Color.YELLOW);
		
		
		JButton my_bttn = new JButton("Dont Click me");
		JButton my_bttn1 = new JButton("Dont Click me");
		JButton my_bttn2= new JButton("Dont Click me");
		JButton my_bttn3 = new JButton("Dont Click me");
		JButton my_bttn4 = new JButton("Dont Click me");
		
		frame.add(my_labl);
		frame.add(my_bttn);
		frame.add(my_bttn1);
		frame.add(my_bttn2);
		frame.add(my_bttn3);
		frame.add(my_bttn4);
		frame.pack();
		frame.setVisible(true);
	}

}
