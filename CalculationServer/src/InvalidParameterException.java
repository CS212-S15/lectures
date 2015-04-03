/*
 * Thrown when a requested parameter does not exist.
 */
public class InvalidParameterException extends Exception {

	//values use to specify the type of error
	public static final int PARAM_NOT_INT = 0;
	public static final int NO_SUCH_PARAM = 1;
	
	private int type;
	
	public InvalidParameterException(int type) {
		this.type = type;
	}

	/*
	 * Return the error type
	 */
	public int getType() {
		return this.type;
	}
	
}

