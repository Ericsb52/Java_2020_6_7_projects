package utilityTime;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class UtilityTimerEx extends JFrame {

    public UtilityTimerEx() {

        initUI();
    }
    
    private void initUI() {
        
        add(new Board1());                
        setResizable(false);
        pack();
        setTitle("Star");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new UtilityTimerEx();
            ex.setVisible(true);
        });
    }
}