
public class Name implements Comparable<Name> {

	private String first;
	private String last;
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public void setLast(String last) {
		this.last = last;
	}
	
	public String toString() {
		return this.first + " " + this.last;
	}

	public String getFirst() {
		return this.first;
	}
	
	public String getLast() {
		return this.last;
	}
	
	@Override
	public int compareTo(Name o) {

		if(this.last.equals(o.getLast())) {
			return this.first.compareTo(o.getFirst());
		}
		return this.last.compareTo(o.getLast());
	
	}
	
	public Name clone() {
		return new Name(this.first, this.last);
	}
	
}
