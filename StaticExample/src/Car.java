
public class Car {

	private String make;
	private String model;
	private long vinNumber;
	private static long vinGenerator = 0;
	
	public Car(String make, String model) {
		
		this.make = make;
		this.model = model;
		this.vinNumber = ++vinGenerator;
	}
	
	public long getVinNumber() {
		return this.vinNumber;
	}
	
	public static long getVinGenerator() {
		return vinGenerator;
	}	
	
	public String getMake() {
		return this.make;
	}
	
}
