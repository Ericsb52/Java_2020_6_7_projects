package cars;

public class Car implements IDrivable,ISafty,IEntertainment{
	public String Color;
	public String make;
	public String model;
	public int volume;
	public boolean belt;
	public int speed; 
	public int tireAngle;

	public Car() {
		volume = 0;
		belt = false;
		speed = 0;
		tireAngle = 0;
	}

	@Override
	public void radioVolume() {
		volume ++;
		
	}

	@Override
	public void seatbelt() {
		if (belt == true) {
			belt = false;
		}
		else {
			belt = true;
		}
		
	}

	@Override
	public void speedup(int setSpeed) {
		if (setSpeed >= speed) {
			speed = setSpeed;
		}
		else {
			return;
		}
		
	}

	@Override
	public void slowdown(int setSpeed) {
		if (setSpeed <= speed) {
			speed = setSpeed;
		}
		else {
			return;
		}
		
	}

	@Override
	public void turnLeft() {
		if (tireAngle >= -22) {
			tireAngle --;
		}
		else {
			return;
		}
		
		
	}

	@Override
	public void turnRight() {
		if (tireAngle <= 22) {
			tireAngle ++;
		}
		else {
			return;
		}
		
	}

	@Override
	public void radioTuner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnSignal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gearshift() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		
	}

}
