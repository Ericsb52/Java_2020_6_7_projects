package eric.broadbent.guessmynumber;

import java.util.Random;
import java.util.Scanner;

public class GuessMy {
	public static String test2 = "testing";

	public GuessMy() {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean win = false;
		int diff;
		int maxRange;
		int totalGuess;
		
		System.out.println("Choose your Difficulty Easy Medium Hard");
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
		
		
		
		
		for (int guess_count = 0; guess_count != totalGuess; guess_count++){
			System.out.println(guessText);
			//guess 1 
			
				if (input.hasNextInt()) { 
					guess = input.nextInt();
					if (guess_count != totalGuess-1) {
						if (guess == the_number) {
							System.out.println("you got it great job");
							win =true;
							
						}
						else if (guess < the_number) {
							System.out.println("Guess higher");
						}
						else {
							System.out.println("Guess Lower");
						}//else
					}
					else {
						if (guess == the_number) {
							System.out.println("you got it great job");
							win =true;
						}
					}
				}//has next
				
				else {
					input.nextLine();
					System.out.println("not a good value loose a Guess");
				}//else
				input.nextLine();
				if (win == true) {
					continue;
				}
			
		}
		
		
		if (win == true) {
			System.out.println("you win");
			
		}
		else {
			System.out.println("you loose");
		}
		
		
		input.close();
	}
	
	public static void main(String[] args) {
		//new GuessMy();
		
		
		for (int dayOfWeek = 0;dayOfWeek < 7; dayOfWeek++) {
			System.out.println("Day " + dayOfWeek + ": ");
			for (int hour = 0; hour < 24; hour++) {
				System.out.println("H " + hour);
				for(int min = 0; min < 60; min++) {
					System.out.println("M " + min);
					for(int sec = 0; sec<60; sec++) {
						System.out.print("S " + sec);
					}
				}
			}
			
			System.out.println("");
		}
		System.out.println("All done");
	}

}
