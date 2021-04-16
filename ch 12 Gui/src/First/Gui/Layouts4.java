package First.Gui;

import java.awt.*;

import javax.swing.*;

public class Layouts4 {

	public Layouts4() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,500);
		frame.setLocation(200,200);
		
		JPanel mainPane = new JPanel();   // create new JPanel
		frame.setContentPane(mainPane);
		GridLayout grid = new GridLayout(2,2);
		BorderLayout border = new BorderLayout();
		FlowLayout flow = new FlowLayout();
		
		
		mainPane.setLayout(grid);
		
		JPanel topLeftpane = new JPanel();
		topLeftpane.setLayout(grid);
		JPanel topRightpane = new JPanel();
		topRightpane.setLayout(border);
		JPanel bottomLeftpane = new JPanel();
		BoxLayout boxlayout1 = new BoxLayout(bottomLeftpane,BoxLayout.Y_AXIS);
		bottomLeftpane.setLayout(flow);
		JPanel bottomRightpane = new JPanel();
		BoxLayout boxlayout2 = new BoxLayout(bottomRightpane,BoxLayout.X_AXIS);
		bottomRightpane.setLayout(boxlayout2);
		
		for (int i = 0;i<4;i++) {
			topLeftpane.add(new JButton("button "+(i+1)));
		}
		
		topRightpane.add(new JButton("button 1"),border.PAGE_START);
		topRightpane.add(new JButton("button 2"),border.PAGE_END);
		topRightpane.add(new JButton("button 3"),border.LINE_START);
		topRightpane.add(new JButton("button 4"),border.LINE_END);
		topRightpane.add(new JButton("button 5"),border.CENTER);
		
		
		
		
		
		
		JButton buttn1 = new JButton("button");
		buttn1.setAlignmentY(Component.CENTER_ALIGNMENT);
		bottomLeftpane.add(buttn1);
		JButton buttn2 = new JButton("button");
		buttn2.setAlignmentY(Component.CENTER_ALIGNMENT);
		bottomLeftpane.add(buttn2);
		JButton buttn3 = new JButton("button");
		buttn3.setAlignmentY(Component.CENTER_ALIGNMENT);
		bottomLeftpane.add(buttn3);
		JButton buttn4 = new JButton("button");
		buttn4.setAlignmentY(Component.CENTER_ALIGNMENT);
		bottomLeftpane.add(buttn4);
		JButton buttn5 = new JButton("button");
		buttn5.setAlignmentY(Component.CENTER_ALIGNMENT);
		bottomLeftpane.add(buttn5);
		
		for (int i = 0;i<4;i++) {
			bottomRightpane.add(new JButton("button "+(i+1)));
			
		}
		public static void print(Object args){
			System.out.println(args);
		}
		
		/*
		JButton buttn6 = new JButton("button");
		buttn6.setAlignmentX(Component.CENTER_ALIGNMENT);
		bottomRightpane.add(buttn1);
		JButton buttn7 = new JButton("button");
		buttn7.setAlignmentX(Component.CENTER_ALIGNMENT);
		bottomRightpane.add(buttn2);
		JButton buttn8 = new JButton("button");
		buttn8.setAlignmentX(Component.CENTER_ALIGNMENT);
		bottomRightpane.add(buttn3);
		JButton buttn9 = new JButton("button");
		buttn9.setAlignmentX(Component.CENTER_ALIGNMENT);
		bottomRightpane.add(buttn4);
		JButton buttn10 = new JButton("button");
		buttn10.setAlignmentX(Component.CENTER_ALIGNMENT);
		bottomRightpane.add(buttn5);
		*/
		
		mainPane.add(topLeftpane);
		mainPane.add(topRightpane);
		mainPane.add(bottomLeftpane);
		mainPane.add(bottomRightpane);
		
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Layouts4();

	}

}
