package echo.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import echo.resource.EchoResource;

public class EchoApplication extends Application {

	    @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> classes = new HashSet<Class<?>>();
	        classes.add(EchoResource.class);
	        return classes;
	    }
}
