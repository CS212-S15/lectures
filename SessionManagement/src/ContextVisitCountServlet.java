import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ContextVisitCountServlet extends BaseServlet {


	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {			
		
		ServletContext context = getServletConfig().getServletContext();		

		int allVisits = (int)context.getAttribute(ContextExampleServer.ALL_VISITS);
		allVisits += 1;
		context.setAttribute(ContextExampleServer.ALL_VISITS, allVisits);
		
		HttpSession session = request.getSession();
		int visitCount;
		String body;
		HashMap<String, String> value = (HashMap<String, String>)session.getAttribute(ContextExampleServer.USER_INFO);
		
		//there is no existing session
		if(value == null) {
			value = new HashMap<String, String>();
			visitCount = 1;
			body = "<p>Welcome, you have not visited this page before!</p>";
		} else {
			visitCount = Integer.parseInt(value.get(ContextExampleServer.VISIT_COUNT)) + 1;
			body = "<p>This is visit number " + visitCount + "!</p>";
		}
		
		value.put(ContextExampleServer.VISIT_COUNT, String.valueOf(visitCount));
		
		PrintWriter out = prepareResponse(response);
		session.setAttribute(ContextExampleServer.USER_INFO, value);

		out.println(header("VisitCount"));		
		out.println(body);		
		out.println("<p>Total number of visits to this site: " + allVisits);
		out.println(footer());
		
		
	}
	
	
}
