import java.util.Scanner;
public class TestAbstract2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Shape to create: ");
		String shapeType = kb.nextLine();
		switch (shapeType) {
			case "circle":
				shape = new Circle(2.5d, "Circle A");
			case "squalre":
				shape = new Square(4.5d, "Squre D");
			case "triangle":
				
		}

		System.out.println(shape);
		shape = new Square(4.5d, "Squre D");
		System.out.println(shape);
		// System.out.println(cir.toString());
		// System.out.println("Diameter = "+cir.diameter());
		// System.out.println(sqr.toString());

		// Circle cir2 = new Circle(2.5d, "Circle B");
		// System.out.println(cir2.toString());
		// System.out.println("Diameter = " + cir2.diameter());
	}
}

//-----------------------------------
abstract class Shape {
	String name;

	// abstract double perimeter(){};
	abstract double perimeter();

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.getName() + "\n\tPerimeter = " + perimeter();
	}
}

class Circle extends Shape {
	double radius;

	public Circle(double r, String n) {
		this.radius = r;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	double diameter() {
		return 2 * this.radius;
	}
}

class Square extends Shape {
	double height;

	public Square(double h, String n) {
		this.height = h;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 4 * this.height;
	}
}
