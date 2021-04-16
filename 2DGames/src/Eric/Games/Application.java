package Eric.Games;

import javax.swing.JFrame;
import java.awt.EventQueue;


public class Application extends JFrame{
	int width = 250;
	int height = 200;
	String title = "My Game";
	
	

	public Application() {
		initUI();
	}
	
	private void initUI() {
		
		add(new Board());
		
		setSize(width, height);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			Application ex = new Application() ;
			ex.setVisible(true);
		});

	}

}
