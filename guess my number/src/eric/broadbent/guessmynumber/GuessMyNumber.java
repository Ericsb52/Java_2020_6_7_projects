package eric.broadbent.guessmynumber;
//imports
import java.util.Random;
import java.util.Scanner;

/*
 * Eric Broadbent
 * 10/20
 * Guess my number
 */

public class GuessMyNumber {

	public GuessMyNumber() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean win = false;
		int diff;
		int maxRange;
		int totalGuess;
		
		System.out.println("Choose youe Difficulty Easy Medium Hard");
		String result = input.nextLine();
		switch(result) 
		{
			case "Easy":
				diff = 1;
				maxRange = 10;
				totalGuess = 3;
				break;
			case "easy":
				diff = 1;
				maxRange = 10;
				totalGuess = 3;
				break;
			case "Medium":
				diff = 2;
				maxRange = 50;
				totalGuess = 5;
				break;
			case "medium":
				diff = 2;
				maxRange = 50;
				totalGuess = 5;
				break;
			case "Hard":
				diff = 3;
				maxRange = 100;
				totalGuess = 10;
				break;
			case "hard":
				diff = 3;
				maxRange = 100;
				totalGuess = 10;
				break;
			default:
				diff = 4;
				maxRange = 1000;
				totalGuess = 1;
				win = true;
				break;
			
		}
		
		
		int the_number = random.nextInt(maxRange)+1;
		System.out.println(the_number);
		int guess;
		
		
		
		System.out.println("Welcome to the Guess my number game");
		System.out.println("Im thinking of a number between 1 and "+maxRange);
		System.out.println(String.format("you have %s guesses to get the number Good luck", totalGuess));
		System.out.println();
		
		String guessText = String.format("Pick a number between 1 and %s",maxRange);
		
		
		System.out.println(guessText);
		//guess 1 
		if (!win) {
			if (input.hasNextInt()) { 
				guess = input.nextInt();
				if (guess == the_number) {
					System.out.println("you got it great job");
					win =true;
				}
				else if (guess < the_number) {
					System.out.println("Guess higher");
				}
				else {
					System.out.println("Guess Lower");
				}
			}
			
			else {
				input.nextLine();
				System.out.println("not a good value loose a Guess");
			}
		}
		//guess 2
		if (!win) {
			System.out.println(guessText);
			if (input.hasNextInt()) { 
				guess = input.nextInt();
			
				if (guess == the_number) {
					System.out.println("you got it great job");
					win =true;
				}
				else if (guess < the_number) {
					System.out.println("Guess higher");
				}
				else {
					System.out.println("Guess Lower");
				}
			}
			else {
				input.nextLine();
				System.out.println("not a good value loose a Guess");
			}
			
		}
		
		//guess 4
		if(!win) {
			if (diff > 1) {
				System.out.println(guessText);
				if (input.hasNextInt()) { 
					guess = input.nextInt();
				
					if (guess == the_number) {
						System.out.println("you got it great job");
						win =true;
					}
					else if (guess < the_number) {
						System.out.println("Guess higher");
					}
					else {
						System.out.println("Guess Lower");
					}
				}
				else {
					input.nextLine();
					System.out.println("not a good value loose a Guess");
				}
				
			}
		}
		//guess 5
		if(!win) {
			if (diff > 1) {
				System.out.println(guessText);
				if (input.hasNextInt()) { 
					guess = input.nextInt();
				
					if (guess == the_number) {
						System.out.println("you got it great job");
						win =true;
					}
					else if (guess < the_number) {
						System.out.println("Guess higher");
					}
					else {
						System.out.println("Guess Lower");
					}
				}
				else {
					input.nextLine();
					System.out.println("not a good value loose a Guess");
				}
				
			}
		}	
		
		//guess 6
		if(!win) {
			if (diff > 2) {
				System.out.println(guessText);
				if (input.hasNextInt()) { 
					guess = input.nextInt();
				
					if (guess == the_number) {
						System.out.println("you got it great job");
						win =true;
					}
					else if (guess < the_number) {
						System.out.println("Guess higher");
					}
					else {
						System.out.println("Guess Lower");
					}
				}
				else {
					input.nextLine();
					System.out.println("not a good value loose a Guess");
				}
				
			}
		}
		
		//guess 7
		if(!win) {
			if (diff > 2) {
				System.out.println(guessText);
				if (input.hasNextInt()) { 
					guess = input.nextInt();
				
					if (guess == the_number) {
						System.out.println("you got it great job");
						win =true;
					}
					else if (guess < the_number) {
						System.out.println("Guess higher");
					}
					else {
						System.out.println("Guess Lower");
					}
				}
				else {
					input.nextLine();
					System.out.println("not a good value loose a Guess");
				}
				
			}
		}
		
		//guess 8
		if(!win) {
			if (diff > 2) {
				System.out.println(guessText);
				if (input.hasNextInt()) { 
					guess = input.nextInt();
				
					if (guess == the_number) {
						System.out.println("you got it great job");
						win =true;
					}
					else if (guess < the_number) {
						System.out.println("Guess higher");
					}
					else {
						System.out.println("Guess Lower");
					}
				}
				else {
					input.nextLine();
					System.out.println("not a good value loose a Guess");
				}
				
			}
		}
		
		//guess 9
		if(!win) {
			if (diff > 2) {
				System.out.println(guessText);
				if (input.hasNextInt()) { 
					guess = input.nextInt();
				
					if (guess == the_number) {
						System.out.println("you got it great job");
						win =true;
					}
					else if (guess < the_number) {
						System.out.println("Guess higher");
					}
					else {
						System.out.println("Guess Lower");
					}
				}
				else {
					input.nextLine();
					System.out.println("not a good value loose a Guess");
				}
				
			}
		}
		//guess 9
				if(!win) {
					if (diff > 2) {
						System.out.println(guessText);
						if (input.hasNextInt()) { 
							guess = input.nextInt();
						
							if (guess == the_number) {
								System.out.println("you got it great job");
								win =true;
							}
							else if (guess < the_number) {
								System.out.println("Guess higher");
							}
							else {
								System.out.println("Guess Lower");
							}
						}
						else {
							input.nextLine();
							System.out.println("not a good value loose a Guess");
						}
						
					}
				}
		
		
		//last guess
		if (!win || diff == 4) {
			System.out.println(guessText);
			if (input.hasNextInt()) { 
				guess = input.nextInt();
			
				if (guess == the_number) {
					System.out.println("you got it great job");
					win =true;
				}
				
				else {
					System.out.println("You loose");
					System.out.println("the number was "+the_number);
				}
			}
			else {
				input.nextLine();
				System.out.println("not a good value loose a Guess");
			}
			
		}
	}

	public static void main(String[] args) {
		new GuessMyNumber();

	}

}
