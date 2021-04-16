package eric.broadbent.car;

import eric.broadbent.carcomponets.Engine;

public class Truck extends Vehical{
	int bed_length;
	String color;
	int numDoors;
	String doorType;
	Long hardWare;
	Engine engine = new Engine();

	public Truck() {
		
	}
	public void start() {
		System.out.println("you started the car");
	}

}
