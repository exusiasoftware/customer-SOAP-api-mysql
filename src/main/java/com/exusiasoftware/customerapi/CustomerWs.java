package com.exusiasoftware.customerapi;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.exusiasoftware.customerapi.entities.Customer;

@WebService
public interface CustomerWs {
	
	@WebMethod
	List<Customer> getCustomers();
	
	@WebMethod
	Customer getCustomer(int id);
	
	@WebMethod
	Customer createCustomer(Customer customer);
	
	@WebMethod
	Customer updateCustomer(Customer customer);
	
	@WebMethod
	void deleteCustomer(Customer customer);
	
	

}
