package com.chris.immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther Chris Lee
 * @Date 12/24/2018 12:07
 * @Description
 */
class FinalReferenceBean {
	
	/*
	 * A final field containing a reference to a mutable object has all the disadvantages of a nonfinal field. While the
	 * reference cannot be modified, the referenced object can be modified—with disastrous results
	 */
	
	static final String[] PRIVATE_VALUES = {"1", "2", "3"};
	
	private static final List<String> UNMODIFIED_PRIVATE_VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
	
	static final String FIRST_NAME = "Chris";
	static final String LAST_NAME = "Li";
	
	public static void main(String[] args) {
		// modifiedContentOfFinalObject();
		unmodifiedPrivateValuesTest();
	}
	
	private static void unmodifiedPrivateValuesTest() {
		for (String unmodifiedPrivateValue : UNMODIFIED_PRIVATE_VALUES) {
			System.out.println(unmodifiedPrivateValue);
		}
	}
	
	@SuppressWarnings("unused")
	private static void modifiedContentOfFinalObject() {
		String firstName = FinalReferenceBean.FIRST_NAME;
		String lastName = FinalReferenceBean.LAST_NAME;
		System.out.println(firstName + " " + lastName);
		System.out.println("====================");
		firstName = "John";
		lastName = " P";
		System.out.println(firstName + " " + lastName);
		PRIVATE_VALUES[2] = "modified 2";
		for (String privateValue : PRIVATE_VALUES) {
			System.out.println(privateValue);
		}
	}
	
}
