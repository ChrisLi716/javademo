package com.chris.lambda;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Auther Chris Lee
 * @Date 2/12/2019 12:54
 * @Description
 */
public class StreamTest {
	
	public static void main(String[] args) {
		testParallel();
	}
	
	private static void testStream() {
		List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
		System.out.println("求和：" + nums.stream()// 转成Stream
			.filter(team -> team != null)// 过滤
			.distinct()// 去重
			.mapToInt(num -> num * 2)// map操作
			.skip(2)// 跳过前2个元素
			.limit(4)// 限制取前4个元素
			.peek(System.out::println)// 流式处理对象函数
			.sum());//
	}
	
	private static void testParallel() {
		long[] arrayOfLong = new long[20000];
		// 1.给数组随机赋值
		Arrays.parallelSetAll(arrayOfLong, index -> ThreadLocalRandom.current().nextInt(1000000));
		// 2.打印出前10个元素
		Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();
		// 3.数组排序
		Arrays.parallelSort(arrayOfLong);
		// 4.打印排序后的前10个元素
		Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}
	
}
