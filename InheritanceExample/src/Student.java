
//Student is abstract. That means we cannot instantiate it.
//We can never invoke 'new Student...'
//Student implements the Comparable interface so that
//we may create a sorted list of Students
public abstract class Student implements Comparable<Student> {

	//The data members of Student need to be accessible to
	//the Student child classes so we use protected rather than
	//private as the access modifier.
	protected String name;
	protected double grade;
	
	protected Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	 
	//Here we are actually overriding the Object toString method.
	public String toString() {
		return "Name: " + this.name + " Grade: " + this.getLetterGrade();
	}
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}	
	
	public String getName() {
		return this.name;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	//This method is abstract and must be implemented by child classes.
	//A tricky bit: if the child class is abstract then it does not 
	//need to implement this method.
	public abstract String getLetterGrade();
	
	
	
}
