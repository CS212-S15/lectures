import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;


public class Test {

	
	public static void openFile() throws IOException {
		//try {
			Path path = FileSystems.getDefault().getPath("file.txt");
			Scanner scan = new Scanner(path);
		//} catch(IOException ioe) {
			
		//}
	}
 	
	
	public static void main(String[] args) {


		Friend f1 = null;
		try {
			f1 = new Friend("Sally", "sallyissocool");
			System.out.println(f1);
		} catch(InvalidLoginException ile) {
			System.out.println(ile.getMessage());
			System.out.println(f1);
		}
		
	}

}
