
//UndergradStudent inherits from Student
//It gets all properties of Student and may add more
public class UndergradStudent extends Student {

	public UndergradStudent(String name, double grade) {
		//construct the parent object before anything else
		super(name, grade); 
	}
	
	
	@Override
	//here we implement the abstract method of the superclass
	public String getLetterGrade() {
		if(this.grade > 90) {
			return "A";
		} else if(this.grade > 80) {
			return "B";
		} else if(this.grade > 70) {
			return "C";
		} else {
			return "F";
		}	
	}
	
	//Here we use partial overriding to implement
	//an Undergrad version of toString.
	//Notice it is partial overriding because
	//we also call the superclass toString method.
	public String toString() {
		return "Undergrad - " + super.toString();
	}


}
