import Student.*;

public class Polymorphism {

	public static void main(String[] args) {
		Student[] studentList = new Student[50];
		
		studentList[0] = new UndergraduateStudent("Ohm");
		studentList[1] = new UndergraduateStudent("Pond");
		studentList[2] = new GraduateStudent("Eak");
		
		for(int i=0;i<3;i++) {
			studentList[i].printName();
		}
	}

}
