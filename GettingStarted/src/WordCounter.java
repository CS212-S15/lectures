import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * A class that counts the number of words that appear in a file.
 * Requirements:
 * 1. Uses a Scanner object to read words from a file.
 * 2. Code should be well designed and modular.
 * @author srollins
 *
 */
public class WordCounter {
	
	/**
	 * returns number of words in file specified.
	 * @param fileName
	 * @return
	 */
	public static int countWords(String fileName) {
		
		int count = 0;
		Path path = FileSystems.getDefault().getPath(fileName);		
	
		
		Pattern pattern = Pattern.compile("\\d+");
		//Pattern pattern = Pattern.compile("[0-9]");
		
		try (Scanner fileScanner = new Scanner(path).useDelimiter(pattern)){
		//try (Scanner fileScanner = new Scanner(path)){
			
			while(fileScanner.hasNext()) {
				System.out.println(fileScanner.next());
				count++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return count;
	}	
	
	public static void main(String[] args) {
		
		System.out.println(countWords("input/test1.txt"));
		
		/*
		int result = countWords("input/test1.txt");
		System.out.println("Result: " + result);
		*/
		
		
	}

}
