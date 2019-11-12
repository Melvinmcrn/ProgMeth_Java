package logic;

public class GradedCourse extends Course{
	
	int score=0;
	
	public GradedCourse(String name, int score) {
		super(name);
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "(GradedCourse): " + super.getName() + ", score: " + this.score;
	}
	
	@Override
	public boolean isPassed() {
		if(this.score > 50) return true;
		return false;
	}
}
