import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CookieVisitCountServlet extends BaseServlet {

	public static final String VISIT_COUNT = "visits";
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {			
		
		String visits = getCookieValue(request, VISIT_COUNT);
		String body = null;
		int newCookieValue;
		
		if(visits == null) {
			body = "<p>Welcome, you have not visited this page before!</p>";
			newCookieValue = 1;
		} else {
			int visitInt = Integer.parseInt(visits); //should do error checking here!			
			newCookieValue = visitInt+1;
			body = "<p>This is visit number " + newCookieValue + "!</p>";
		}
		
		
		PrintWriter out = prepareResponse(response);
		setCookieValue(request, response, VISIT_COUNT, String.valueOf(newCookieValue));
		
		out.println(header("VisitCount"));		
		out.println(body);		
		out.println(footer());
		
	}
	
	
}
