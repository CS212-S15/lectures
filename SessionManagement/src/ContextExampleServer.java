import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class ContextExampleServer {

	public static void main(String[] args) throws Exception {
		
        Server server = new Server(8080);
 
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);        
        server.setHandler(handler);

        handler.addEventListener(new ServletContextListener() {

			@Override
			public void contextDestroyed(ServletContextEvent sce) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void contextInitialized(ServletContextEvent sce) {
				sce.getServletContext().setAttribute(BaseServlet.ALL_VISITS, 0);
			}
        	
        });
        
        
        handler.addServlet(ContextVisitCountServlet.class, "/contextvisit");
                
        server.start();
        server.join();

	}
	
}
