package eric.broadbent.carcomponets;

public class Engine {
	public int cylinders;
	String type;

	public Engine() {
		cylinders = 6;
		type = "v";
	}
	public void engine_dis() {
		System.out.println( type +" " + cylinders);
	}
	

}
