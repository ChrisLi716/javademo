package com.chris.guava;

import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

/**
 * @Auther Chris Lee
 * @Date 1/3/2019 10:52
 * @Description
 */
public class Main {
	
	public static void main(String[] args) {
		LoadingCache<Integer, Customer> cutomerCache = CustomerCacheProvider.INSTANCE.getCustomerCache();
		/*
		 * V get(K key) : This will either return an already cached value, or else use the cache's CacheLoader to atomically
		 * load a new value into the cache
		 */
		try {
			System.out.println("Cache size : " + cutomerCache.size());
			System.out.println("Get Customer 1 : " + cutomerCache.get(1).getFirstName());
			System.out.println("----------------------------");
			System.out.println("Cache size : " + cutomerCache.size());
			System.out.println("Get Customer 1 : " + cutomerCache.get(1).getFirstName());
			System.out.println("Get Customer 3 : " + cutomerCache.get(3).getFirstName());
            System.out.println("Cache size : " + cutomerCache.size());
		}
		catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
