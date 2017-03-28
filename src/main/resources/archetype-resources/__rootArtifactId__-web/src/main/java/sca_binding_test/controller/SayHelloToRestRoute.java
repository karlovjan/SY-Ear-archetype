#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.sca_binding_test.controller;

import org.apache.camel.builder.RouteBuilder;

public class SayHelloToRestRoute extends RouteBuilder {

	public void configure() {
		
		from("switchyard://SayHelloToRestService")
		.log("Received message for 'SayHelloToRestService' : ${symbol_dollar}{body}")
		.to("switchyard://SayHelloToREF")
		.log("Received message from 'SayHelloToREF' : ${symbol_dollar}{body}");
	}

}
