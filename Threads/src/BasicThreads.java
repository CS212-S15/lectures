
public class BasicThreads {

	public static void main(String[] args) {

		//instantiate a Runnable object
		InfinitePrinter p1 = new InfinitePrinter("T1");
		InfinitePrinter p2 = new InfinitePrinter("T2");
				
		//pass the runnable to a Thread object
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		//start the Thread
		t1.start();
		t2.start();
				
		/* TBD: using join */
		
		System.out.println("Finished");
		
		
	}

}
