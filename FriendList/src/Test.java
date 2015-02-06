

public class Test {

	
	public static void main(String[] args) {

		FriendBook book = new FriendBook();
		Friend f1 = null;
		Friend f2 = null;
		Friend f3 = null;
		try {
			f1 = new Friend("Sally", "sally");
			f2 = new Friend("Bob", "bob");
			f3 = new Friend("Herb", "herb");
			
			book.addFriend("sally", f2);
			book.addFriend("sally", f3);
			book.addFriend("herb", f1);
			
			System.out.println(book);
		
		} catch(InvalidLoginException ile) {
			System.out.println(ile.getMessage());
			System.out.println(f1);
		}
		
	}

}
