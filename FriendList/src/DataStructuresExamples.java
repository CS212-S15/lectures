import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;


public class DataStructuresExamples {

	
	public static void tryArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("frog");
		list.add("dog");
		list.add("cat");
		list.add("zebra");
		list.add("antelope");
	
		Collections.sort(list);
		
		for(String s: list) {
			System.out.println(s);
		}		
		
		list.add("bear");
		System.out.println("++++++++++++");
		
		for(String s: list) {
			System.out.println(s);
		}		
	}
	
	public static void tryTreeSet() {
		
		TreeSet<String> sortedlist = new TreeSet<String>();
		sortedlist.add("frog");
		sortedlist.add("dog");
		sortedlist.add("cat");
		sortedlist.add("zebra");
		sortedlist.add("antelope");
		
		for(String s: sortedlist) {
			System.out.println(s);
		}		
		sortedlist.add("bear");
		System.out.println("++++++++++++");
		
		for(String s: sortedlist) {
			System.out.println(s);
		}		

		
	}
	
	public static void tryHashMap() {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("cat", 50);
		map.put("dog", 48);
		map.put("frog", 5);
		
		//System.out.println("number of cats: " + map.get("cat"));
		
		for(String s: map.keySet()) {
			System.out.println(s + " -> " + map.get(s));
		}
		
	}
	

	public static void tryComplexTreeMap() throws InvalidLoginException {
		
		TreeMap<String, Friend> map = new TreeMap<String, Friend>();
		
		Friend bob = new Friend("Bob", "bob");
		Friend herb = new Friend("Herb", "herb");
		Friend sally = new Friend("Sally", "sally");
		
		map.put("bob", sally);
		map.put("sally", herb);
		map.put("herb", sally);
		
		for(String name: map.keySet()) {
			System.out.println(name + " has friend " + map.get(name));
		}
		
		
	}
	
	public static void tryComplexTreeMapWithList() throws InvalidLoginException {
		
		TreeMap<String, ArrayList<Friend>> map = new TreeMap<String, ArrayList<Friend>>();
		
		Friend bob = new Friend("Bob", "bob");
		Friend herb = new Friend("Herb", "herb");
		Friend sally = new Friend("Sally", "sally");

		ArrayList<Friend> bobslist = new ArrayList<Friend>();
		bobslist.add(sally);
		bobslist.add(herb);
		map.put("bob", bobslist);

		ArrayList<Friend> sallyslist = new ArrayList<Friend>();
		sallyslist.add(herb);
		map.put("sally", sallyslist);
		
		sallyslist = null;
		ArrayList<Friend> list = map.get("sally");
		list.add(bob);
		
		
		
	}
	
	
	public static void main(String[] args) {
		try {
			tryComplexTreeMap();
		} catch (InvalidLoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
