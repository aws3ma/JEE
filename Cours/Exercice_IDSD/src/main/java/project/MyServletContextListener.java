package project;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener{
	// define LOG as constant variable
	private static final Logger LOG = 
            Logger.getLogger( MyServletContextListener.class.getName() );
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.log( Level.INFO, "======!!!!! MyServletContextListener App Started !!!!!====== " );
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.log( Level.INFO, "======!!!!! MyServletContextListener App Stopped !!!!!====== " );
    }

}
