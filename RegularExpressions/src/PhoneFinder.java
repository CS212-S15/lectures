import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PhoneFinder {

	public static String readFile(String fileName) {

		ArrayList<Byte> byteList = new ArrayList<>();

		Path path = FileSystems.getDefault().getPath(fileName);		

		try (InputStream instream = Files.newInputStream(path);
				DataInputStream reader = new DataInputStream(instream)) {
			byte next;
			while((next = (byte)reader.read()) != -1) {
				byteList.add(next);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		byte[] bytes = new byte[byteList.size()];
		for(int i = 0; i < byteList.size(); i++) {
			bytes[i] = byteList.get(i);
		}

		String data = new String(bytes);
		return data;

	}	

	public static String extractHeaders(String data) {
		//TODO: demonstrate greedy versus reluctant quantifiers
		return data.replaceFirst("(?ism)((.+?:.+?)(^\\s*$))", "");		

	}
	
	public static TreeSet<Integer> getAreaCodes(String data) {
		
		TreeSet<Integer> areaCodes = new TreeSet<>();
		String regex = "(\\d{3})-(\\d{3})-(\\d{4})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			int areaCode = Integer.parseInt(matcher.group(1));
			areaCodes.add(areaCode);
			//System.out.println(matcher.group());
		}
		return areaCodes;		
		
	}

	public static void main(String[] args) throws IOException {
		String data = readFile("customerinfo.txt");
		data = extractHeaders(data);
		System.out.println(data);
		//System.out.println(getAreaCodes(data).size());
	}


}
