package com.exusiasoftware.customerapi;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebServiceConfig {
	
	@Autowired
	private Bus bus;
	
	@Autowired
	private CustomerWs customerService;
	
	@Bean 
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, customerService);
		endpoint.publish("/customers");
		return endpoint;
		
		
		
	}
	
	
	

}
