import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet invoked to add a new score to the list of scores.
 * User must be logged in (name Cookie exists)
 */
public class AddScoresServlet extends BaseServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		processRequest(request, response);
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//retrieve name
		String name = getName(request);
		//if user is not logged in, redirect to login page
		if(name == null) {
			response.sendRedirect(response.encodeRedirectURL("/login"));
			return;
		} 	

		//retrieve score
		int score;
		boolean baddata = false;
		try {
			score = getIntParam("score", request);
			//add score to list in datastore
			Data.getInstance().add(name, score);
		} catch(InvalidParameterException ipe) {
			//if user entered an unparsable number set baddata flag
			if(ipe.getType() == InvalidParameterException.PARAM_NOT_INT)
				baddata = true;
		}

		//prepare to respond
		PrintWriter p = prepareResp(response);
		
		p.println(header("Add Scores for " + name));
		p.println("Hello, " + name + "<br/>");

		//if user entered bad data, print error
		if(baddata) {
			p.println("<h3><font color=\"red\">Input must be a number</font></h3>");
		}

		//prompt for new score
		p.println("<form name=\"newscore\" action=\"addscores\" method=\"post\">");
		p.println("Score:");
		p.println("<input type=\"text\" name=\"score\"/>");
		p.println("<input type=\"submit\" value=\"Submit\"/>");
		p.println("</form>");

		//provide option to stop entering scores and calculate average
		p.println("<form name=\"calc\" action=\"calcavg\" method=\"get\">");
		p.println("<input type=\"submit\" value=\"Calculate Average\"/>");
		p.println("</form>");

		p.println(footer());


	}


}
