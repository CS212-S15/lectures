import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet invoked at login.
 * Creates cookie and redirects to main AddScoresServlet.
 */
public class VerifyUserServlet extends BaseServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		String name = request.getParameter("name");
		
		if(name == null || name.trim().equals("")) {
			response.sendRedirect(response.encodeRedirectURL("/login?status=error"));
			return;
		}
		//set cookie and redirect to addscores
		response.addCookie(new Cookie("name", name));
		response.setStatus(HttpServletResponse.SC_OK);
		response.sendRedirect(response.encodeRedirectURL("/addscores"));
	}
	
}
