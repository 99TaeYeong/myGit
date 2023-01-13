package ch11;

public class Plane implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Plane SpeedUP");
	}

	@Override
	public void speedDown() {
		System.out.println("Plane SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Plane Handling");
	}

}
