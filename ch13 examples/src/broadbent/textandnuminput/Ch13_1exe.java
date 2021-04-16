package broadbent.textandnuminput;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ch13_1exe implements ActionListener,ChangeListener{
	JFrame frame;
	JTextField firstName;
	JTextField lastName;
	JButton my_bttn;
	JTextArea discription;
	JSpinner ageSpinner;
	String[] gamesList = {"wow","zelda","Mario","mario kart","skotor 1","starwars battlefront 2"};
	int index = 0;
	JComboBox cBtestBox;
	public Ch13_1exe() {
		
		
		frame = new JFrame();
		JPanel contentPane = (JPanel)frame.getContentPane();
		FlowLayout flowlayout = new FlowLayout();
		BoxLayout box = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
		
		frame.setLayout(box);
		frame.setTitle("Message dialog gui");
		frame.setSize(500,500);
		frame.setLocation(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		firstName = new JTextField(20);
		lastName = new JTextField();
		
		discription = new JTextArea(5,20);
		discription.setLineWrap(false);
		discription.setText(gamesList[0]);
		
		JScrollPane diswithscrollbar = new JScrollPane(discription,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		ageSpinner = new JSpinner(new SpinnerNumberModel(0.001,0,1,0.001));
		//ageSpinner.addChangeListener(this);
		
		JList favGamesJList = new JList(gamesList);
		favGamesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane glistScrollPane  = new JScrollPane(favGamesJList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//favGamesJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//favGamesJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		favGamesJList.setSelectedIndex(1);
		cBtestBox = new JComboBox();
		cBtestBox.setEditable(true);
		//cBtestBox.setSelectedIndex(1);
		//cBtestBox.setSelectedItem("WOW");

		my_bttn = new JButton("Submit");
		my_bttn.addActionListener(this);
		
		contentPane.add(new JLabel("First Name"));
		contentPane.add(firstName);
		contentPane.add(new JLabel("Last Name"));
		contentPane.add(lastName);
		contentPane.add(new JLabel("discription"));
		contentPane.add(diswithscrollbar);
		contentPane.add(glistScrollPane);
		contentPane.add(cBtestBox);
		contentPane.add(new JLabel("age"));
		contentPane.add(ageSpinner);
		
		contentPane.add(my_bttn);
		
		
		
		frame.pack();
		frame.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		
		if (control == my_bttn) {
			
			index++;
			discription.setText(gamesList[index]);
			String fName = firstName.getText();
			String lName = lastName.getText();
			String distext = discription.getText();
			JOptionPane.showMessageDialog(frame,"hello "+fName+" "+lName+"\n"+distext);
			cBtestBox.addItem(fName);
			cBtestBox.addItem(lName);
			cBtestBox.addItem(distext);
			String selected = (String)cBtestBox.getSelectedItem();
			firstName.setText(selected);
			
		}
		else {
			JOptionPane messagebox = new JOptionPane();
			String title = messagebox.showInputDialog(frame,"Enter your favorite color","your Color",JOptionPane.WARNING_MESSAGE);
			String result = messagebox.showInputDialog(frame,"Enter your favorite color",title,JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(frame,"you like the color "+result);
		}
	}
	
	public static void main(String[] args) {
		new Ch13_1exe();

	}


	@Override
	public void stateChanged(ChangeEvent e) {
		int userAge = (Integer)ageSpinner.getValue();
		int target_age = 25;
		if (userAge < target_age) {
			int toTAge = target_age - userAge;
			JOptionPane.showMessageDialog(frame,"you are "+toTAge+" years from the Target age");
		}
		else {
			JOptionPane.showMessageDialog(frame,"wow your old");
		}
		
	}


}
