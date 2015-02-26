import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class SummationExample {

	public static final long MAX = 300000; 
	
	public static void main(String[] args) {
		
		
		/* TBD: list of threads */
		/* TBD: executor service */
		
		
		long start = System.currentTimeMillis(); //retrieve current time when starting calculations
		
		for(long i = 1; i < MAX; i++) {
			/* TBD: sequential execution */
			
			/* TBD: one thread per task */
			
			/* TBD: thread pool */
		
		}
		
		/* TBD: join on all threads */
		
		/* TBD: shutdown executor service */
		
		
		long end = System.currentTimeMillis(); //retrieve current time when finishing calculations
		System.out.println("time: " + (end-start));
	}
		
	
}

