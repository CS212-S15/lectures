import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Base class for all Servlets in this application.
 * Provides general helper methods.
 */
public class BaseServlet extends HttpServlet {
	
	/*
	 * Return the beginning part of the HTML page.
	 */
	protected String header(String title) {
		return "<html><head><title>" + title + "</title></head><body>";		
	}
	
	/*
	 * Return the last part of the HTML page. 
	 */
	protected String footer() {
		return "</body></html>";
	}
	
	/*
	 * Add a cookie to the response with the specified key and value
	 */
	protected void setCookieValue(HttpServletRequest request, HttpServletResponse response, String key, String value) {
		Cookie[] cookies = request.getCookies();
		response.addCookie(new Cookie(key, value));
	}
	
	/*
	 * Given a request and a key, return the cookie value associated
	 * with the key or null if no such cookie exists.
	 */
	protected String getCookieValue(HttpServletRequest request, String key) {
		Cookie[] cookies = request.getCookies();

		String value = null;
		
		if(cookies != null) {
			//for each cookie, if the key is name, store the value
			for(Cookie c: cookies) {
				if(c.getName().equals(key)) {
					value = c.getValue();
				}
			}
		}
		return value;		
	}
			
	/*
	 * Prepare a response of HTML 200 - OK.
	 * Set the content type and status.
	 * Return the PrintWriter.
	 */
	protected PrintWriter prepareResponse(HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		return response.getWriter();

	}
	
}
