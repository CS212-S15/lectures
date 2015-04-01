import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Gradebook {

	/* need list of students */
	//Use the most general type possible for the reference
	private List<Student> students;
	
	public Gradebook() {
		this.students = new ArrayList<Student>();
	}
	
	
	/* add a student */
	public void addStudent(Student s) {
		this.students.add(s);
	}	
	
	/* display sorted list of all students */	
	public void displayStudents() {		
		Collections.sort(this.students); //We can do this because Student is Comparable.
		for(Student s: this.students) {
			System.out.println(s.toString());
		}		
	}
		
	public void rentCars() {
		
		//Only grad students can rent cars.		
		for(Student s: this.students) {
			//confirm the current student is a grad student
			if(s instanceof GradStudent) {
				//use casting to treat the object as a GradStudent and then call rentCar
				((GradStudent)s).rentCar();
			}
		}
	}
	
}
