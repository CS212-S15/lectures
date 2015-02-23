import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSONParseExample {

	private static final String CONFIG_FILE = "config.json";

	public static void main(String[] args) {
		JSONObject jsonobject = null;
		JSONParser parser = new JSONParser();
		

		Path path = FileSystems.getDefault().getPath(CONFIG_FILE);
		BufferedReader in = null;
		
		try {
			in = Files.newBufferedReader(path, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			jsonobject = (JSONObject) parser.parse(in);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println( ((JSONArray)jsonobject.get("firstArray")).get(1) );
		
		
	}

}
