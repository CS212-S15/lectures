import java.util.TreeMap;

public class FriendBook {

	private TreeMap<String, FriendList> friendbook;
	
	public FriendBook() {
		this.friendbook = new TreeMap<String, FriendList>();
		
	}
	
	public void addFriend(String name, Friend friend) {
		
		//if name is not in the friendbook
		//  create a new friendlist for name
		//  put name and name's new friendlist into the friendbook
		
		//get name's friendlist
		//add friend to the list
				
	}
	
	public String toString() {
		StringBuffer bookString = new StringBuffer();
		for(String name: this.friendbook.keySet()) {
			bookString.append("Name: " + name + " - Friends: " + this.friendbook.get(name).toString() + "\n");
		}
		return bookString.toString();
	}
	
}
