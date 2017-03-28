#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@RequestScoped
@Path("/greetings")
public interface GreetingEndpoint {

	@GET
	@Path("{name}") 
	@Produces(MediaType.TEXT_PLAIN)
	String sayHelloTo(@PathParam("name") String name);
	
}
