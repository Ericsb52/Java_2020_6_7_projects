package eric.chapter4.lesson2;

public class Lesson2exe {

	public Lesson2exe() {
		// variable declaration statements
		int bankaccounttotal$; //4 bytes
		short num_of_hotdogs_i_can_eat;// 2 bytes
		byte myage; //1 byte
		long dream_val;//8 bytes
		
		
		// fractional numbers
		float mygpa; // 4 bytes
		//double PIE; // 8 bytes
		
		// boolean data types true or false
		boolean answer;//1 byte
		
		//none numeric data type
		char letter;// 2 bytes
		String name;
		
		
		//Variable assignment statements
		bankaccounttotal$ = -2000;//int assignment has to be in the range of -2,147,483,648 to 2,147,483,647
		num_of_hotdogs_i_can_eat = 500;// short assignment # can't be bigger than -32,768 to 32,767
		myage = 40; //byte assignment has to be in the range of -128 to 127
		dream_val = 250000000000000L;// long assignment has to be in the range of 	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 and must end with the L
		
		mygpa = 3.85f;//float assignment must be in the range 1.40239846 x 10-45 to 3.402823467 x 1038 and have the F
		final double PIE = 3.141579;// 	4.94065645841246544 x 10-324 to 1.79769313486231570 x 10308
		
		
		letter = 'a';
		answer = true;
		 
		double value1 = 7.6;   
		int value2 = (int) (value1+0.5);
		System.out.println(value2);
		
		
		//mathmatical opperators
		/*
		-
		+
		*
		/
		%
		*/
		bankaccounttotal$  = bankaccounttotal$+5000;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$  = bankaccounttotal$-1000;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$  = bankaccounttotal$*1000;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$  = bankaccounttotal$/1;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$+=200;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$-=200;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$*=200;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$/=200;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$%=200;
		System.out.println(bankaccounttotal$);
		
		myage+=1;
		myage++;
		myage--;
		
		int    value3 = 7; 
		double value4 = value3 + 3.5; 
		
		
		System.out.println("my age is "+myage);
		System.out.print("abd");
		System.out.print("def");
		System.out.print("ghi");
		System.out.print("jkl");
		System.out.println();
		//System.out.println("I said, \"Hi\"  \b \f \n \r \t \' \\ ");   
		
		//System.out.print("New line:\n#\n");
		//System.out.print("Carriage return:\r#\n");
		System.out.print("Tab:\t#\n");
		System.out.print("Backslash:\\\n");
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Lesson2exe();

	}

}
