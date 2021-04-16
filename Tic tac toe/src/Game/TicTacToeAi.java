package Game;

import java.util.*;
// Changes to be made 11/10 fixed my issues

///////////////////////////////////////////////////////////////////
// was getting a null point exception
// need to fix check winner to not return null and change to ""
// change win to ""
// change game loop to check for ""
// was getting a -1 out of range exception
// add checks in to computer move to check for -1 
// it will require an if and else if 
// if move != -1 do every thing like normal 
// else if move == -1 continue
// clear move if it was not -1
///////////////////////////////////////////////////////////////////



public class TicTacToeAi {
	// global variables to be used in all the methods and game
	Scanner input = new Scanner(System.in);
	String human ;
	String computer ;

	
	//build Methods
	//////////////////////////////////////////////////////////////////////////////////////////
	
	//game intro
	public void intro() {
		System.out.println("Welcome to the greatest intellectual challenge of all time: Tic-Tac-Toe.");
		System.out.println("This will be a showdown between your human brain and my silicon processor.");
		System.out.println("You will make your move known by entering a number, 0 - 8.  The number");
		System.out.println("will correspond to the board position as illustrated:");
		System.out.println("\t\t+-----------+");
		System.out.println("\t\t| 0 | 1 | 2 |");
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| 3 | 4 | 5 |");
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| 6 | 7 | 8 |");
		System.out.println("\t\t+-----------+");
		System.out.println("Prepare yourself, human.  The ultimate battle is about to begin. \n");
	}
	// gets a yes or no response to any yes or no question
	public String yes_no_response(String question) {

		String response = "";
		while (true) {
			System.out.println(question);
			response = input.nextLine();
			if (response.equalsIgnoreCase("yes")){
				break;
			}
			else if (response.equalsIgnoreCase("no")) {
				break;
			}	
		}
		return response.toLowerCase();
	}
	// gets a user input for a number makes sure it is a good input and returns it if it is
	public int get_number(String question, int low, int high) {
		while (true) {
			
			int numInput;
			try {
				System.out.println(question);
				numInput = input.nextInt();
				if (!(numInput >=low && numInput <=high)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
				return numInput;
				
			}catch(InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				input.nextLine();
				continue;
			}
		}	
	}
	// Assignees the tokens to the human and computer 
	public void pieces(String X,String O) {
		String go_first = yes_no_response("Do you require the first move? (yes/no): ");
		if (go_first.equals("yes")) {
			human = X;
			computer = O;
		}
		else {
			human = O;
			computer = X;
		}
	}
	// populates the game board with empty spaces
	public String[] new_board(int NUM_SQUARES,String EMPTY) {
		String[] board = new String[NUM_SQUARES];
		for (int i = 0;i<NUM_SQUARES;i++) {
			board[i]=EMPTY;
		}
		
		return board;
		
	}
	// displays the updated board
	public void display_board(String[] board) {
		System.out.println("\t\t\t+-----------+");
		System.out.println("\t\t\t| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
		System.out.println("\t\t\t+-----------+");
	}
	//Creates a list of legal moves
	public int[] legal_moves(String[] board,int NUM_SQUARES,String EMPTY) {
		int[] moves = new int[NUM_SQUARES];
		
		for (int i = 0;i<NUM_SQUARES; i++) {
			if (board[i] == EMPTY) {
				moves[i] = i;
			}
			else {
				moves[i] = -1;
			}
		}
		return moves;
		
	}
	// gets a valid human move
	public int human_move(String[] board,int NUM_SQUARES,String EMPTY) {
		int[] moves = legal_moves(board,NUM_SQUARES,EMPTY);
		int move = -1 ;
		while (true){
			move =get_number("Where will you move? (0 - 8):", 0, NUM_SQUARES);
				for(int x:moves) {
					if (move == x){
						return move;
					}
				}
				System.out.println("That square is already occupied, foolish human.  Choose another.");
		}
	}
	//switches turns
	public String next_turn (String turn) {
		if (turn == "X"){
			return "O";
		}
		else {
			return "X";
		}
	}
	//check the board for a winner
	public String checkWinner(String[] board,String EMPTY,String TIE) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			// top row
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			// mid row	
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			//bottom row
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			// vertical left
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			// vertical mid
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			// vertical right
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			//Diagonal
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			//Diagonal
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
			if (board[a] == EMPTY) {
				break;
			}
			else if (a == 8) {
				return TIE;
			}	
		}
		return "";
	}
	// figures out the best move for the computer
	public int comp_move(String[] board, String EMPTY,String TIE) {
		String[] test_board = new String[9];
		//make a copy to work with since function will be changing array
		for (int i = 0; i<9;i++) {
			test_board[i] = board[i];
		}
		int[] best_moves = {0,1,2,3,4,5,6,7,8,9};
		int[] legalmoves = legal_moves(board,9,EMPTY);
		
		
		// checking if any of the legal moves the computer can win with
		for (int move: legalmoves) {
			if( move != -1) {
				System.out.println("in if statment for checking comp move");
				test_board[move] = computer;
				String win = checkWinner(test_board,EMPTY,TIE);
				System.out.print(win);
				if (win.equals(computer)) {
					return move;
				}
			}
			else if (move == -1){
				continue;	
			}
			test_board[move] = EMPTY;
		}
		
		// if human can win 
		for (int move: legalmoves) {
			if (move != -1) {
				System.out.println("in if statment for checking human move");
				test_board[move] = human;
				String win = checkWinner(test_board,EMPTY,TIE);
				if (win.equals(human)) {
					return move;
				}
			}
			else if(move == -1) {
				continue;
			}
			test_board[move] = EMPTY;
		}
		
		// choose best move
		for (int move:best_moves) {
			boolean inarray = contains(legalmoves,move);
			if (inarray) {
				return move;
			}
		}
		return best_moves[0];
		
		
	}
	// checks to see if a value is in an array works for int arrays only
	public boolean contains(int[] array, int key) {
		for(int i: array) {
			if (i == key) {
				return true;
			}
		}
		return false;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	// build game
	public TicTacToeAi() {
		String X = "X";
		String O = "O";
		String EMPTY = " ";
		String TIE = "TIE";
		int NUM_SQUARES = 9;
		int move;
		String win = "";
		
		
		// game setup
		intro();// intro to game 
		pieces(X,O);// set tokens
		String[] board = new_board(NUM_SQUARES,EMPTY);//create an empty board

		
		String turn = "X";
		display_board(board);
		while(win == "") {
			
			if (turn == human) {
				move = human_move(board,NUM_SQUARES,EMPTY);
				board[move] = human;
			}
			else {
				System.out.println("comp turn");
				move = comp_move(board, EMPTY,TIE);
				System.out.println(move);
				board[move] = computer;
			}
			display_board(board);
			win = checkWinner(board,EMPTY,TIE);
			turn = next_turn(turn);
			
		}
		System.out.println(win);
		
		// testing
		
		/*
		int[] legal_moves = legal_moves(board,NUM_SQUARES,EMPTY);
		for(int var: legal_moves) {
			System.out.println(var);
		}
		*/

		//for(String var: board) {
			//System.out.println(var);
		//}

		//System.out.println(human);
		//System.out.println(computer);
		
		//String x = yes_no_response("is this working");
		//System.out.println(x);
		
		//int i = get_number("pick a number between 0 and 8",0,8);
		//System.out.println(i);

	}//end constructor
	
	
	//start game
	public static void main(String[] args) {
		new TicTacToeAi();

	}//end main

}//end class
