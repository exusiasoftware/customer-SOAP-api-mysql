package com.exusiasoftware.customerapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exusiasoftware.customerapi.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
