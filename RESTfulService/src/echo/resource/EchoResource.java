package echo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


/*@Path("/echo/{your_name}")*/
@Path("/echo")
public class EchoResource {

    /*@GET @Path("/echo")
    @Produces("text/plain")
    public String echo(@PathParam("your_name") String name,
                          @QueryParam("echo_msg") String echoString) {
        return "Hi "+name+". You said "+echoString;
    }*/
	
	 @GET
	 @Produces("text/plain")
	 public String echo(@QueryParam("echo_msg") String echoString) {
		 return echoString;
	 }

	
    
}
