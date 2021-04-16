package Eric.Games;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Shape_exe extends JFrame{

	public Shape_exe() {
		initUI();
	}
	private void initUI() {
	
	    add(new Board());
	
	    setSize(330, 330);
	
	    setTitle("Donut");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	}  
	public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
           Shape_exe ex = new Shape_exe();
            ex.setVisible(true);
        });
    }

}
