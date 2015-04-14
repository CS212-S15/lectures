import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Allows a user to log in
 */
public class LoginServlet extends BaseServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//if user is logged in, redirect
		if(getName(request) != null) {
			response.sendRedirect(response.encodeRedirectURL("/addscores"));
			return;
		}
		
		System.out.println(request.getRequestURI());
		
		boolean statusok = true;
				
		Map m = request.getParameterMap();
		if(m.containsKey("status")) {
			 String status = ((String[])m.get("status"))[0];
			 if(status.trim().equals("error")) {
				 statusok = false;
			 }		 
		}
		
		
		//output text box requesting user name
		PrintWriter p = prepareResp(response);
		
		p.println(header("Login Page"));		

		if(!statusok) {
			p.println("<h3><font color=\"red\">Invalid Request to Login</font></h3>");
		}

		p.println("<form name=\"name\" action=\"verifyuser\" method=\"post\">");
		p.println("Name:");
		p.println("<input type=\"text\" name=\"name\"/>");
		p.println("<input type=\"submit\" value=\"Login\"/>");
		p.println("</form");
		
		p.println(footer());

	}
	
}
