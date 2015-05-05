import java.net.MalformedURLException;
import java.net.URL;


public class URLExample {

	public static void tryURL(URL baseURL, String path) throws MalformedURLException {
		
		URL url = new URL(baseURL, path);
			
		System.out.println("BaseURL: " + baseURL);
		System.out.println("New path: " + path);
		System.out.println("NewURL: " + url);
		System.out.println("Host: " + url.getHost());
		System.out.println("Path: " + url.getPath());
		
	}
	
	public static void main(String[] args) throws MalformedURLException {
		
		tryURL(new URL("http://www.cs.usfca.edu/~srollins/"), "pubs.html");	
		System.out.println();
		tryURL(new URL("http://www.cs.usfca.edu/~srollins/"), "#courses");
		System.out.println();
		tryURL(new URL("http://www.cs.usfca.edu/~srollins"), "http://google.com");
		
		
	}
	
}
