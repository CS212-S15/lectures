
public class GradStudent extends Student {

	public GradStudent(String name, double grade) {		
		super(name, grade);
	}	
		
	public void rentCar() {
		System.out.println("yay! renting a car.");
	}
	
	@Override
	public String getLetterGrade() {
		
		if(this.grade > 90) {
			return "A";
		} else if(this.grade > 80) {
			return "B";
		} else {
			return "F";
		}
	}

	public String toString() {
		return "Grad - " + super.toString();
	}
}
