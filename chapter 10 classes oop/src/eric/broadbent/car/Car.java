package eric.broadbent.car;
import java.util.Scanner;

import eric.broadbent.carcomponets.Engine;

public class Car extends Vehical{
	String color;
	int numDoors;
	String doorType;
	Long hardWare;
	Engine engine = new Engine();
	

	public Car() {
		Scanner  input = new Scanner(System.in);
		System.out.println("what color do you want your car");
		color = input.nextLine();
		System.out.println("how many doors do you want on your car");
		numDoors = input.nextInt();
		input.nextLine();
		price=25000.00;
		brand = "chevy";
		
		input.close();
	}
	
	public void drive() {
		if (engine.cylinders == 8) {
			System.out.println("im driving realy fast");
		}
		else {
			System.out.println("im driving");
		}
		
	}
	public void start() {
		System.out.println("you started the car");
	}

}
