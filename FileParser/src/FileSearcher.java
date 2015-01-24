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
		return false;
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
		return false;
	}
	
	
	public static void main(String[] args) {
		boolean result = FileSearcher.containsString("input/test1.txt", "abc", "\\d");
		System.out.println(result);
	}
	
	
}
