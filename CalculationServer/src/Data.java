import java.util.ArrayList;
import java.util.HashMap;

/*
 * Uses Singleton pattern to maintain a HashMap of all user data.
 */
public class Data {

	//only 1 instance of this object will ever be created.
	private static final Data INSTANCE = new Data();

	//maintain a hash of username to list of values entered
	private HashMap<String, ArrayList<Integer>> hm;

	//constructor
	private Data() {
		hm = new HashMap<String, ArrayList<Integer>>();
	}
	
	/*
	 * For a given user, add a new score	
	 */
	public synchronized void add(String name, int newscore) {
		ArrayList<Integer> al = hm.get(name);
		if(al != null) {
			al.add(newscore);
		} else {
			al = new ArrayList<Integer>();
			al.add(newscore);
			hm.put(name, al);
		}
	}
	
	/*
	 * Calculate a given user's average.
	 */
	public synchronized double average(String name) {
		ArrayList<Integer> scores = hm.get(name);
		if(scores == null || scores.size() == 0)
			return 0;
		double sum = 0;
		for(int i:scores) {
			sum += i;
		}
		hm.remove(name); //clear the cache
		return (sum/scores.size());
	}
	
	/*
	 * Return true if the data contains entries for a given user.
	 */
	public synchronized boolean contains(String name) {
		return hm.containsKey(name);
	}
	
	/*
	 * Return the instance of this object.
	 */
	public static Data getInstance() {
		return INSTANCE;
	}


}
