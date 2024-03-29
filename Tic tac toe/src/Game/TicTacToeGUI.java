package Game;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//javax.swing.* is used to create JFrames. java.awt.* is used to create labels and buttons. java.awt.event.* is used to create functions for buttons. 
/**
 * 
 * @ original author MeneXia (Xavi Ablaza)--Created basic logic for the game
 * @ Making the GUI and creating other edits for the game--D-Studios(Devang Bhatnagar)
 *
 *
 */

//In this class, a Tic-Tac-Toe game is created.
public class TicTacToeGUI extends JPanel{
    static String[] board;  
    static String turn;
    //A list of buttons is created and, when clicked, can change array values in board[]. This will be used to see if someone won or if a draw occurred. 
    static List<JButton> buttons=new ArrayList<JButton>();
    static JFrame frame=new JFrame();
    static int value=0;
    static String winner = null;
    static JLabel information=new JLabel("<html>Welcome to 2 Player Tic Tac Toe.<br/>\n.<br/> Click near the center of a slot to place X in:");
    
    //In the main function, a JFrame window is being created and the lines from the paintComponent function are drawn. Then, populateEmptyBoard is called.
    public static void main(String[] args) {
    	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          TicTacToeGUI ticTacToe=new TicTacToeGUI();
          frame.add(ticTacToe);
          frame.setContentPane(ticTacToe);
 
          frame.setVisible(true);
        board = new String[9];
        turn = "X";
       
        populateEmptyBoard();
       
    }
    //In winningText, checkWinner is called to see if a player has won. If the player won or a draw occurred, the label on the window is updated to show it.
    static void winningText() {
    	winner=checkWinner();
    	if(winner!=null) {
        if (winner.equalsIgnoreCase("draw")) {
        	information.setText("<html>It's a draw!<br/> Thanks for playing.");
        } else {
        	information.setText("<html>Congratulations!<br/> "+ winner+ " has won!<br/> Thanks for playing.");
        }
    	}
    }
//In this function, the board array is used to see if there is a winner or if a draw occurred. If both of these conditions are false, the game continues.
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains("Empty")){
                break;
            }
            else if (a == 8) return "draw";
        }
        information.setText(turn+"'s turn. Click near the center of a slot to place "+turn+" in.");
        return null;
    }
    
    
//In this function, buttons are created for the player to put his/her/their turns in. Every time a player clicks on an applicable button, the board array is updated.
    static void populateEmptyBoard() {
    	frame.setLayout(null);
    	information.setBounds(10,160, 400, 400);   
        frame.add(information);
        int xIncrease=0; 
        int yIncrease=-100;
        
        for(int i=0; i<9; i++) board[i]="Empty";
        
        for(int y=0; y<3; y++){
         
        	xIncrease=0;
        	yIncrease+=100;
            for (int x = 0; x < 3; x++) {
                buttons.add(new JButton(""));
                buttons.get(value).setBounds(xIncrease, yIncrease, 100, 100);
                buttons.get(value).setOpaque(false);
                buttons.get(value).setContentAreaFilled(false);
                buttons.get(value).setBorderPainted(false);
                frame.add(buttons.get(value));
               buttons.get(value).addActionListener(new ActionListener() {
            	   int val=value;
            	   public void actionPerformed(ActionEvent e) {
            		   if(winner==null && board[val]=="Empty") {
            		  board[val]=turn;
            		   buttons.get(val).setText(turn);
          
            		   if (turn.equals("X")) {
                           turn = "O";
                       } else {
                           turn = "X";
                       }
            		 winningText();
            		   }
            		   else if(winner!=null) information.setText("The game has already been finished!");
            		   else information.setText("<html>The slot is already taken!<br/> Pick another slot!");
            	   }
               });
                value++;
                xIncrease+=100;
            }
            frame.setSize(300,450);
          frame.setResizable(false);
          }
        
        
        
        
    }
//In this in-built function, three black vertical lines and two black horizontal lines are created to separate the buttons in a Tic-Tac-Toe fashion. 
	 public void paintComponent(Graphics g) {
	    	super.paintComponent(g);
	    	int x=100;
	    	g.setColor(Color.BLACK);
	    	for(int i=0; i<2; i++) {
	    	g.drawLine(0, 0+x, 300,0+x);
	    	if(i==2) break;
	    	g.drawLine(0+x,0,0+x, 300);
	    	x+=100;
	    	}
	    	
	    }
    
    
}
