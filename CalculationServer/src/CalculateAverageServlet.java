
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet called when the user is ready to calcualte the average of 
 * all values entered.
 */
public class CalculateAverageServlet extends BaseServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//get user's name
		String name = getName(request);
		//get the instance of the data
		Data d = Data.getInstance();
		//get any last score the user may have entered before asking for the average
		int score;
		boolean containsscore = false;
		try {
			score = getIntParam("score", request);
			containsscore = true;
		} catch(InvalidParameterException ipe) {
			score = 0;
		}
		
		//if the user is not logged in, redirect to login page
		if(name == null) {
			response.sendRedirect(response.encodeRedirectURL("/login"));
			return;
		} 	

		String body = null;
		//if the user entered a last score, add it to the data set
		if(containsscore) {
			d.add(name, score);
		} 
		
		if(!d.contains(name)) { //true if no values have been entered			
			body = "<h1>You haven't entered any values!</h1>";
		} else {
			double result = d.average(name);			
			body = "<h1>Your average is: " + result + "</h1>";
		}
		
		//get the average of all values
		//output result
		PrintWriter p = prepareResp(response);
		p.println(header("Average"));
		p.println(body);
		p.println(footer());
		
		
	}
	
}
