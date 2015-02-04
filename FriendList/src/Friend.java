
public class Friend {

	private String name;
	private String login;
	
	private static final int MINLENGTH = 3;
	private static final int MAXLENGTH = 10;
	
	public Friend(String name, String login) throws InvalidLoginException {
		
		this.name = name;
		
		//if null		
		if(login == null) {
			throw new InvalidLoginException("Login provided is null");
		}		
		
		//if too short
		if(login.length() < MINLENGTH) {
			
			InvalidLoginException ile = new InvalidLoginException("Login provided is too short");			
			throw ile;
		}
		
		
		//if too long
		if(login.length() > MAXLENGTH) {
			throw new InvalidLoginException("Login provided is too long");
		}
		
		this.login = login;
		
	}

	public String getName() {
		return this.name;
	}
	
	
	public boolean equals(Object o) {
		
		Friend other = (Friend)o;
		String othersname = other.getName();
		
		return (this.name.equals(othersname));
		
	}
	
	public String toString() {
		return ("Name: " + this.name + " Login: " + this.login);
	}
	
}
