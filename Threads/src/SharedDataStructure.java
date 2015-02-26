import java.util.ArrayList;
import java.util.List;


public class SharedDataStructure {

	private List<Integer> numbers;
	
	public SharedDataStructure() {
		this.numbers = new ArrayList<Integer>();
	}
	
	/* TBD: use of the synchronized keyword */
	public void addNumber(int number) {
		this.numbers.add(number);
	}	

	public int size() {
		return this.numbers.size();
	}
}
