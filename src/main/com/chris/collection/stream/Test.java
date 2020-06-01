package com.chris.collection.stream;

import java.util.concurrent.ThreadLocalRandom;

public class Test {

	public static void main(String[] args) {

		System.out.println(ThreadLocalRandom.current().nextInt(1000000));
	}
}
