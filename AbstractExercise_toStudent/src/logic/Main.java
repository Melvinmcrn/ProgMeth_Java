package logic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course progmeth = new GradedCourse("progmeth",51);
		Course communityService = new BooleanCourse("Community Service", false);
		
		
		Course socialEvent = new Course("fun activities") {
		//TO DO Q2
		//Hint: Anonymous Inner class
					
					@Override
					public boolean isPassed() {
						return true;
					}
					
					@Override
					public String toString() {
						return "(Annonymous Inner Course): " + this.getName();
					}
					
				};
		
		System.out.println(progmeth.isPassed());
		System.out.println(communityService.isPassed());
		System.out.println(socialEvent.isPassed());
		
		// toString
		System.out.println(progmeth.toString());
		System.out.println(communityService.toString());
		System.out.println(socialEvent.toString());
		
		// Clone
		GradedCourse cloneCourse = (GradedCourse) progmeth.clone();
		System.out.println(cloneCourse.toString());
		
		System.out.println();
		
		// Student class contains the enrolled courses
		Student student = new Student("Amarin");
		student.enrollCourse(progmeth);
		student.enrollCourse(communityService);
		student.enrollCourse(socialEvent);
		student.computeIsPassed();
		System.out.println(student.toString());
	}

}
 
