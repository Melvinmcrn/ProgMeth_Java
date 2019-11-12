package Super;

class Vehicle2 {
	int wheel=4;
	Vehicle2(int w) {
		this.wheel = w;
		System.out.println("Vehicle is created");
	}
}

public class Bike2 extends Vehicle2 {
	Bike2() {
		super(2);// will invoke parent class constructor
		System.out.println("Bike is created");
	}

	public static void main(String args[]) {
		Bike2 b = new Bike2();
	}
}