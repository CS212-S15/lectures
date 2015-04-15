import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class SessionExampleServer {

	public static void main(String[] args) throws Exception {
		
        Server server = new Server(8080);
 
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);        
        server.setHandler(handler);
 
        handler.addServlet(SessionVisitCountServlet.class, "/sessionvisit");
                
        server.start();
        server.join();

	}
	
}
