#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;


@Service(value = Greeting.class, name = "GreetingService")
public class GreetingBean implements Greeting {

	@Inject
    private Logger log;
	
	@Override
	public String sayHelloTo(String name) {
		
		String text = String.format("Hello, %s", name);
		
		log.info(text);
		
		return text;
	}

}
