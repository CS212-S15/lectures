
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
	
	/**
	 * Returns the VIN number of the car.
	 * @return long representing VIN number
	 */
	public long getVinNumber() {
		return this.vinNumber;
	}
	
	public static long getVinGenerator() {
		return vinGenerator;
	}	
	
	public String getMake() {
		return this.make;
	}

	/**
	 * Allows programmer to change the make of the car.
	 * @param make - the make of the car
	 */
	public void setMake(String make) {
		this.make = make;
	}

	
}
