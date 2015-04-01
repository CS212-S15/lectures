import java.util.ArrayList;


public class FriendList {

	private ArrayList<Friend> friends;
	
	public FriendList() {
		this.friends = new ArrayList<>();
	}
	
	public void addFriend(Friend friend) {
		this.friends.add(friend);
	}	
	
	public String toString() {
		
		StringBuffer friendString = new StringBuffer();
		for(Friend f: friends) {
			friendString.append(f.getName() + " ");
		}
		return friendString.toString();
	}
	
}
