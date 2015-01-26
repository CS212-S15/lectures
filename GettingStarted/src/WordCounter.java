import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

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
		
		
		Path path = FileSystems.getDefault().getPath(fileName);		
		Scanner fileScanner = new Scanner(path);
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
	}

}
