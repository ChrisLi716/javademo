package com.chris.guava;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther Chris Lee
 * @Date 1/3/2019 10:45
 * @Description
 */
class CustomerRepo {
	private Map<Integer, Customer> customers = new HashMap();
	
	CustomerRepo()
	{
		// add data
		Customer customer1 = new Customer(1, "Jhon");
		Customer customer2 = new Customer(2, "James");
		Customer customer3 = new Customer(3, "Mark");
		
		customers.put(1, customer1);
		customers.put(2, customer2);
		customers.put(3, customer3);
		
	}
	
	Customer findById(Integer id) {
		if (customers.containsKey(id)) {
			return customers.get(id);
		}
		return null;
	}
}
