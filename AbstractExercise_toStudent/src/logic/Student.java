package logic;

import java.util.ArrayList;

public class Student {
	//To DO: Q3
	//HINT:
	protected ArrayList<Course> coursesEnrolled;
	protected ArrayList<Boolean> isPassedList;
	private String name;
	
	
	public Student(String name) {
		super();
		//To DO: Q3
		//HINT:
		this.coursesEnrolled = new ArrayList<Course>();
		this.name = name;
		//To DO: Q3
		//HINT:
		this.isPassedList = new ArrayList<Boolean>();
	}
	
	public void enrollCourse(Course c) {
		//TO DO: Q3
		this.coursesEnrolled.add(c);
	}
	
	public void computeIsPassed() {
		//TO DO: Q3
		this.isPassedList.clear();
		for(Course c : this.coursesEnrolled) {
			this.isPassedList.add(c.isPassed());
		}	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

// TO DO: Q3	
	@Override
	public String toString() {
		String out = "Student name: " + this.name + "\n";
		for(int i=0; i<this.coursesEnrolled.size(); i++) {
			out += "- Course: " + this.coursesEnrolled.get(i).getName() + ", isPassed: " + this.isPassedList.get(i) + "\n";
		}
		return out;
	}
	
	
	
	
	
	
	
}
