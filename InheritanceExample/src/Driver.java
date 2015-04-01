
public class Driver {

	public static void main(String[] args) {

		Gradebook gb = new Gradebook();
		gb.addStudent(new GradStudent("Bob", 99.0));
		gb.addStudent(new UndergradStudent("Jane", 85.0));
		gb.displayStudents();
		
		//This is possible. We cannot call rentCar on s, tho.
		Student s = new GradStudent("Bob", 99.0);
		
		//This invokes the GradStudent version of toString because of dynamic binding.
		s.toString();
		
		//We can change the type of object that s refers to as long as it is in the Student
		//hierarchy.
		s = new UndergradStudent("Jane", 85.0); 
	}

}
