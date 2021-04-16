import java.awt.EventQueue;
import javax.swing.JFrame;


public class Animation extends JFrame {

	//using swing timer to create animation
	public Animation() {
		initUI();
	}
	private void initUI() {
		add(new Board());
		setResizable(false);
		pack();
		setTitle("Shooting Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Animation ex = new Animation();
			ex.setVisible(true);
		});
	}

	

}
