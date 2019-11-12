/**
  In factory pattern, the application does not have to know
  how the classes extended from Shape, only need to know the name.
  As a result, new classes can be extended from Shape and the application
  does not need to change the code.

  This makes the application decoupling with the Shape hierarch.
**/
public class TestAbstractWithFactory {   
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("Shape to create: ");
		String shapeType = kb.nextLine();
		Shape shape = ShapeFactory.getShape(shapeType, ...);

		// Shape sh = new Shape(); // Shape cannot create a new object itself.
		// Shape cir = new Circle(2.5d, "Circle A");
		// Shape sqr = new Square(4.5d, "Square D");
		Shape cir = ShapeFactory.getShape("Circle", 2.5d, "Circle A");
		Shape sqr = ShapeFactory.getShape("Square", 4.5d, "Square D");

		System.out.println(cir.toString());
		// System.out.println("Diameter = "+cir.diameter());
		System.out.println(sqr.toString());


		// Circle cir2 = new Circle(2.5d, "Circle B");
		Circle cir2 = (Circle) ShapeFactory.getShape("Circle", 2.5d, "Circle B");
		System.out.println(cir2.toString());
		System.out.println("Diameter = " + cir2.diameter());
	}
}

class ShapeFactory {
	public static Shape getShape(String shapeType, String name, double size) {
		switch (shapeType) {
			case null:
				return null;
			case "Circle":
				return new Circle(size, name);
			case "Square":
				return new Square(size, name);
			// if new class is added to this Shape hierarchy,
			// just add new case
		}
	}
}

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
	private double height;

	public Square(double h, String n) {
		this.height = h;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 4 * this.height;
	}
}
