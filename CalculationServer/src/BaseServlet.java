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
	 * Given a request, return the name found in the 
	 * Cookies provided.
	 */
	protected String getName(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();

		String name = null;
		
		if(cookies != null) {
			//for each cookie, if the key is name, store the value
			for(Cookie c: cookies) {
				if(c.getName().equals("name")) {
					name = c.getValue();
				}
			}
		}
		return name;
	}
	
	/*
	 * Given a request and key, retrieve the parameter associated with the key and
	 * convert it into an integer.
	 * Throw an InvalidParameterException if the key does not specify a valid parameter
	 * or if the value provided by the user is not an integer.
	 */
	protected int getIntParam(String key, HttpServletRequest request) throws InvalidParameterException {
		
		Map m = request.getParameterMap();
		int value;
		//if the key refers to a valid parameter
		if(m.containsKey(key)) {
			try {
				//parse the value
				value = Integer.parseInt(((String[])m.get(key))[0]);
			} catch(NumberFormatException nfe) {
				throw new InvalidParameterException(InvalidParameterException.PARAM_NOT_INT);
			}
		} else {
			//the key is not a valid paramter
			throw new InvalidParameterException(InvalidParameterException.NO_SUCH_PARAM);
		}
		return value;
	}
	
	/*
	 * Prepare a response of HTML 200 - OK.
	 * Set the content type and status.
	 * Return the PrintWriter.
	 */
	protected PrintWriter prepareResp(HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		return response.getWriter();

	}
	
}
