package com.chris.reflect;

import com.chris.reflect.Bean.HumanBeing;
import com.chris.reflect.Bean.Male;

import java.util.Arrays;

/**
 * @Auther Chris Lee
 * @Date 12/24/2018 12:47
 * @Description
 */
public class MainTest {
	
	public static void main(String[] args)
		throws Exception {
		HumanBeing.desc();
		Male.desc();
		Male male = new Male("Chris", "CN", "Male");
		male.setCarList(Arrays.asList("Lamborghini", "VM"));
		String descStr = ReflectUtils.buildRequestStr(male);
		System.out.println(descStr);
	}
}
