package com.exusiasoftware.customerapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exusiasoftware.customerapi.entities.Customer;
import com.exusiasoftware.customerapi.repos.CustomerRepository;



@Service
public class CustomerWsImpl implements CustomerWs {
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public List<Customer> getCustomers() {
		
		return customerRepo.findAll();
		
	}

	@Override
	public Customer getCustomer(int id) {
	
		return customerRepo.findById(id).get();
	}

	@Override
	public Customer createCustomer(Customer customer) {
	
		return customerRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

}
