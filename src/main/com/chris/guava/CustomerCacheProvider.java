package com.chris.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

/**
 * @Auther Chris Lee
 * @Date 1/3/2019 10:50
 * @Description
 */
public enum CustomerCacheProvider
{
	INSTANCE;
	private LoadingCache<Integer, Customer> customerCache;
	
	private CustomerRepo customerRepo;
	
	CustomerCacheProvider()
	{
		customerRepo = new CustomerRepo();
		customerCache =
			CacheBuilder.newBuilder().maximumSize(100).expireAfterWrite(5, TimeUnit.MINUTES).build(new CacheLoader<Integer, Customer>() {
				@Override
				public Customer load(Integer id) {
					return customerRepo.findById(id);
				}
			});
	}
	
	public LoadingCache<Integer, Customer> getCustomerCache() {
		return customerCache;
	}
}
