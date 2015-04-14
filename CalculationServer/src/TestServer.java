import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletHandler;


public class TestServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		Server server = new Server(8080);
        
        //create a ServletHander to attach servlets
        ServletHandler servhandler = new ServletHandler();
        servhandler.addServletWithMapping("LoginServlet", "/login/*");
        servhandler.addServletWithMapping("VerifyUserServlet", "/verifyuser");
        servhandler.addServletWithMapping("AddScoresServlet", "/addscores");
        servhandler.addServletWithMapping("CalculateAverageServlet", "/calcavg");

        //set the list of handlers for the server
        server.setHandler(servhandler);
        
        //start the server
        server.start();
        server.join();

	}

}
