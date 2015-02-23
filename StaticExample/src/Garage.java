
public class Garage {

	public static void main(String[] args) {

		Car acura = new Car("acura", "tsx");
		Car smart = new Car("smart", "fortwo");
		
		System.out.println(acura.getVinNumber());
		System.out.println(smart.getVinNumber());
		System.out.println(acura.getVinGenerator());
		System.out.println(smart.getVinGenerator());
	
		System.out.println(Car.getVinGenerator());
		
		
	}

}
