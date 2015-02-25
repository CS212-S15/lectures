import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingExample {

	private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());
	
	public static void main(String[] args) {

		String level = "SEVERE";
		
		FileHandler fhandler = null;
		try {
			fhandler = new FileHandler("out.log");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		fhandler.setLevel(Level.INFO);
		fhandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fhandler);
		
		//logger.setLevel(Level.parse(level));
		
		logger.severe("HELP! Something really bad happened");
		logger.warning("Something kinda bad happened");
		logger.info("For the programmer's eyes only");
		
	}

}
