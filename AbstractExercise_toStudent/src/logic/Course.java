package logic;

public abstract class Course implements Cloneable {

	  private String name;

	  public Course(String name){      // ... with constructor
	    this.name = name;
	  }

	  public abstract boolean isPassed();
	  
	  public abstract String toString();
	  
	  // TO DO: QUESTION 4
	  @Override
	  public boolean equals (Object o) {
		  return this == o;
	  }
		  
		
	  // TO DO: QUESTION 4
	  protected Object clone() {
		  try {
			  Course c = (Course) super.clone(); //clone the course
			  return c;
		  } catch (CloneNotSupportedException e) {
			  // TODO Auto-generated catch block
			  throw new InternalError();
		  } 
	  }
		  

	  public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  
	}
	

