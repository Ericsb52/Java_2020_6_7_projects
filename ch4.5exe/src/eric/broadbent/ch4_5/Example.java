package eric.broadbent.ch4_5;
import java.util.*;

public class Example {

	public Example() {
		Scanner input = new Scanner(System.in);
		//System.out.println("type somthing in");
		//String test = input.nextLine();
		
		
		//String.format("The input format parameter is a String that can contain a mixture of fixed text and format specifiers",  "Object param");
		public static void print(Object arg){
			System.out.println(args);
		}
	
		System.out.print("enter in a word");
		String word1 =input.nextLine();
		System.out.print("enter in a word");
		String word2 =input.nextLine();
		System.out.print("enter in a word");
		String word3 =input.nextLine();
		System.out.print("enter in a word");
		String word4 =input.nextLine();
		System.out.print("enter in a word");
		String word5 =input.nextLine();
		System.out.print("enter in a word");
		String word6 =input.nextLine();
		System.out.print("enter in a word");
		String word7 =input.nextLine();
		System.out.print("enter in a word");
		String word8 =input.nextLine();
		System.out.print("enter in a word");
		String word9 =input.nextLine();
		System.out.print("enter in a word");
		String word10 =input.nextLine();
		
		
		// %[parameter_index$][flags][width][.precision]
		//String result = String.format("Three %(d blind mice %2$tr ",-2856935,Calendar.getInstance( ));
		String myText = String.format("It is a "+word1+" time for the\r\n" + 
				"Rebellion. Although the "+word2+"\r\n" + 
				"Star has been destroyed,\r\n" + 
				"Imperial "+word3+" have driven the\r\n" + 
				"Rebel forces from their hidden\r\n" + 
				"base and pursued them across\r\n" + 
				"the galaxy.\r\n" + 
				"\r\n" + 
				"Evading the %1$S Imperial\r\n" + 
				"%2$S, a group of freedom\r\n" + 
				"fighters led by Luke %3$S\r\n" + 
				"has established a new secret\r\n" + 
				"base on the %1$s ice world\r\n" + 
				"of Hoth.\r\n" + 
				"\r\n" + 
				"The evil lord Darth Vader,\r\n" + 
				"obsessed with finding young\r\n" + 
				"Skywalker, has dispatched\r\n" + 
				"thousands of remote probes into\r\n" + 
				"the far reaches of space....",word4,word5,word6,word7,word8,word9,word10);
		
		System.out.println(myText);
		
		
		input.close();
		
		
		
	}

	public static void main(String[] args) {
		new Example();

	}

}
