package First.Gui;

import javax.swing.*;
import java.awt.*;

public class Layouts {
	JFrame myFrame;
	JPanel contentPane ;// gives access to default contentPane

	public Layouts() {
		myFrame =new JFrame(); // create the JFrame window
		contentPane = new JPanel(); // creates a new contentPane
		myFrame.setContentPane(contentPane);//replace old JPanel w/ our new one!
		
		myFrame.setLayout(new FlowLayout()); //option 1 now access to the layout manager
		
		FlowLayout flowlayout = new FlowLayout();// option 2 you now have access to the layout manager 
		GridLayout grid = new GridLayout(3,2);
		grid.setHgap(20);
		grid.setVgap(20);
		BorderLayout border1 = new BorderLayout();
		BorderLayout border2 = new BorderLayout(5,10);
		BoxLayout boxlayout1 = new BoxLayout(contentPane,BoxLayout.Y_AXIS);
		BoxLayout boxlayout2 = new BoxLayout(contentPane,BoxLayout.X_AXIS);
		
		contentPane.setLayout(boxlayout2);//sets the layout manager
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(300,500);
		myFrame.setLocation(200,200);
		/*
		for (int i = 0;i<10;i++) {
			myFrame.add(new JButton("button "+(i+1)));
		}
		*/
		/* boarder layout button creation
		myFrame.add(new JButton("button 1"),border2.PAGE_START);
		myFrame.add(new JButton("button 2"),border2.PAGE_END);
		myFrame.add(new JButton("button 3"),border2.LINE_START);
		myFrame.add(new JButton("button 4"),border2.LINE_END);
		myFrame.add(new JButton("button 5"),border2.CENTER);
		*/
		JButton buttn1 = new JButton("button 1");
		buttn1.setAlignmentY(Component.CENTER_ALIGNMENT);
		myFrame.add(buttn1);
		JButton buttn2 = new JButton("button 1");
		buttn2.setAlignmentY(Component.TOP_ALIGNMENT);
		myFrame.add(buttn2);
		JButton buttn3 = new JButton("button 1");
		buttn3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		myFrame.add(buttn3);
		JButton buttn4 = new JButton("button 1");
		buttn4.setAlignmentY(Component.CENTER_ALIGNMENT);
		myFrame.add(buttn4);
		JButton buttn5 = new JButton("button 1");
		buttn5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		myFrame.add(buttn5);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		myFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts();

	}

}
