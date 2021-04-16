package ch6exe;

import java.util.Scanner;

import testpkg.Test;
import eric.broadbent.guessmynumber.GuessMy;



public class Ch8_1exe {
	
	

	public Ch8_1exe() {
		print("hello");
		print(1);
		print(3.14);
		print(true);
		String x = input("will this work?");
		print(x);
		String y = input("testing a number input");
		print(y);
		
		print(Test.test);
		print(GuessMy.test2);

		
	}
	
	public static String input(String question) {
		Scanner input = new Scanner(System.in);
		print(question);
		String x = input.next();
		
		return x;
		
	}

	public static void main(String[] args) {
		new Ch8_1exe();

	}
	
	public static void steve() {
		System.out.println("my name is steve");
		
		String test = "test";
	}
	
	public static void print(Object x) {
		System.out.println(x);
		System.out.println(Test.test);
	}
	
	

}
