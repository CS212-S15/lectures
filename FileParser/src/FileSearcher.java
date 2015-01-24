import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;


public class FileSearcher {
	
	
	/**
	 * Takes as input a file and target string and returns true if the file contains the string and false otherwise.
	 * Tokens in the file are delimited by whitespace.
	 * @param fileName
	 * @param target
	 * @return
	 */
	public static boolean containsString(String fileName, String target) {
		return containsString(fileName, target, "\\s+");
	}		
	
	/**
	 * Takes as input a file, a target string, and a regular expression (specified as a string) that indicates
	 * the pattern that delimits tokens in the file. The method returns true if the file contains the target
	 * string and false otherwise.
	 * @param fileName
	 * @param target
	 * @return
	 */
	public static boolean containsString(String fileName, String target, String delimiter) {
		Path path = FileSystems.getDefault().getPath(fileName);
		
		boolean found = false;
		
		//Regex reference: http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		Pattern pattern = Pattern.compile(delimiter);
		
		try ( Scanner fileScanner = new Scanner(path).useDelimiter(pattern)
		) {
			while(fileScanner.hasNext()) {
				String nextToken = fileScanner.next().toLowerCase();
				if(nextToken.equals(target)) {
					found = true;
				}
				
			}
			
		} catch (IOException e) {
			System.out.println("FileSearcher.containsString::exception reading file");
			System.out.println(e.getMessage());
		}
		/*
		if(found) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found :(");
		}
		*/
		return found;
	}
	
	
	public static void main(String[] args) {
		boolean result = FileSearcher.containsString("input/test1.txt", "abc", "\\d");
		System.out.println(result);
	}
	
	
}
