import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;


public class FileSearcher {
	
	
	public static void containsString(String fileName, String target) {
		
		Path path = FileSystems.getDefault().getPath(fileName);
		
		boolean found = false;
		
		//Regex reference: http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		Pattern pattern = Pattern.compile("\\d+");
		
		try ( Scanner fileScanner = new Scanner(path).useDelimiter(pattern)
		) {
			while(fileScanner.hasNext()) {
				String nextToken = fileScanner.next().toLowerCase();
				System.out.println("Next token: " + nextToken);
				if(nextToken.equals(target)) {
					found = true;
				}
				
			}
			
		} catch (IOException e) {
			System.out.println("FileSearcher.containsString::exception reading file");
			System.out.println(e.getMessage());
		}
		if(found) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found :(");
		}
		
	}
	
	
	public static void main(String[] args) {
		FileSearcher.containsString("input/test1.txt", "here");
	}
	
	
}
