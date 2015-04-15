import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class ContextExampleServer {

	public static final String VISIT_COUNT = "visits";
	public static final String USER_INFO = "userInfo";
	public static final String ALL_VISITS = "allVisits";
	public static final String SHARED_DATA = "sharedData";

	public static void main(String[] args) throws Exception {
		
        Server server = new Server(8080);
 
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);        
        server.setHandler(handler);

        HashMap<String, String> sharedDataMap = new HashMap<String, String>();
        sharedDataMap.put(ALL_VISITS, String.valueOf(0));
        handler.setAttribute(SHARED_DATA, sharedDataMap);
        
        handler.addServlet(ContextVisitCountServlet.class, "/contextvisit");
                
        server.start();
        server.join();

	}
	
}
