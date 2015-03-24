import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Example {

	public static void tryTweet() {
		
		String tweet = "Everyone knows #cs212 is an #awesome class"; //at #usf
		
		Pattern p = Pattern.compile("#.*");
		//Pattern p = Pattern.compile("#.*\\s"); //greedy
		//Pattern p = Pattern.compile("#.*?\\s"); //reluctant
		//Pattern p = Pattern.compile("#(.*?)\\s"); //grouping
		//Pattern p = Pattern.compile("#(.*?)(\\s|$)"); //end of the line
		
		int count = 0;
		Matcher m = p.matcher(tweet);		
		while (m.find()) {
			System.out.println("Tag " + ++count + ": "  + m.group());
		}
		
	}
	
	public static void tryEmail() {
		
		String addrs = "srollins@cs.usfca.edu, snrollins@usfca.EDU, srollins@gmail.com";
		
		//Pattern p = Pattern.compile(".*\\.(com|edu)"); //greedy
		//Pattern p = Pattern.compile(".*?\\.(com|edu)"); //reluctant
		//Pattern p = Pattern.compile("(?i).*?\\.(com|edu)"); //case insensitive
		//Pattern p = Pattern.compile("(?i)(.*?)@(.*?)\\.(com|edu)"); //grouping w/ @
		Pattern p = Pattern.compile("(?i)(^|\\s)(.*?)@(.*?)\\.(com|edu)"); //start at beginning of user
		
		
		int count = 0;
		Matcher m = p.matcher(addrs);		
		while (m.find()) {
			System.out.println("User " + ++count + ": "  + m.group(2));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		//tryTweet();
		tryEmail();		
	}
	
	
}
