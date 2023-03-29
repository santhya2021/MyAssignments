package week1.day1.assignment;

public class Car {
	public void driveCar() {
		// TODO Auto-generated method stub
		System.out.println("Driving the Car");

	}
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Applying the break");
	}
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("press the horn");
	}
	public void isPuncture() {
		// TODO Auto-generated method stub
		System.out.println("car is punctured");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Displaying the Activity of Car:");
		Car activity=new Car();
		activity.driveCar();
		activity.applyBrake();
		activity.soundHorn();
		activity.isPuncture();

	}

}
