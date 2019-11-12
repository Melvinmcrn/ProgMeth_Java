public class TestAbstract {
	public static void main(String[] args) {
		Shape s = new Shape() {
				int side=5;
				
				@Override
				double perimeter() {
					return side * 5;
				}
		};
	}
	
	public static class MySquare extends Shape{
		int side=5;
		
		@Override
		double perimeter() {
			return side * 5;
		}
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

abstract class Polygon extends Shape{
	double dimension;
	
	abstract int getDimension();
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
