import java.util.TreeSet;


public class NameSet {

	TreeSet<Name> names; 
	
	public NameSet() {
		this.names = new TreeSet<>();
	}
	
	public NameSet(TreeSet<Name> names) {
		this.names = names;
	}

	public boolean addAndPrint(Name name) {

		boolean result = names.add(name);
		System.out.println("names.size = " + names.size());
		return result;

		//TODO: use try-finally instead

	}
	
	public void clear() {		
		/*
		 * For assertions to work correctly, make sure to use the
		 * -enableassertions flag. In Eclipse, 
		 * Run As > Run Configurations > Arguments > VM Arguments
		 */
		
		assert (this.names.size() > 0): "Cannot clear empty NameSet";
		
		this.names = new TreeSet<>();
		
	}
	
	public Name getFirst() {
		assert (this.names.size() > 0): "Cannot get first item of emtpy NameSet";
		
		return this.names.first();
	}
	
	public NameSet clone() {
		TreeSet<Name> newSet = new TreeSet<Name>();
		for(Name name: this.names) {			
			//TODO: create deep copy
			newSet.add(name);
		}
		return new NameSet(newSet);
		
		//Alternate code for creating shallow copy
		//return new NameSet((TreeSet<Name>)names.clone());
	}
	
	public void display() {
		for(Name name: this.names) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		NameSet nameSet = new NameSet();
		nameSet.addAndPrint(new Name("Bob", "Smith"));

		//Demonstrate assert
//		nameSet.clear();
//		System.out.println("NameSet cleared");
//		nameSet.clear();
		
		//Demonstrate shallow copy
		nameSet.addAndPrint(new Name("Jane", "Doe"));
		nameSet.addAndPrint(new Name("Herb", "Alexander"));
		NameSet copy = nameSet.clone();
		
		Name name = copy.getFirst();
		name.setFirst("NEW");
		name.setLast("GUY");
		
		System.out.println("***Original***");
		nameSet.display();

		System.out.println("***Copy***");
		copy.display();
	
	
	}
		
}
