package logic;

public class BooleanCourse extends Course{
	
	boolean pass = false;
	
	public BooleanCourse(String name, boolean grade) {
		super(name);
		this.pass = grade;
	}

	@Override
	public String toString() {
		return "(BooleanCourse): " + super.getName() + ", grade: " + this.pass;
	}
	
	@Override
	public boolean isPassed() {
		return this.pass;
	}
}
