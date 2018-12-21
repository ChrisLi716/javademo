package com.chris.lambda;

/**
 * @Auther Chris Lee
 * @Date 12/21/2018 12:45
 * @Description
 */
public class FunctionInterfaceTest {
	
	public static void main(String[] args) {
		FunctionInterfaceTest test = new FunctionInterfaceTest();
		
		test.func(() -> test.outputStr("Hello Lambda!"));
		
		test.funcParams((Integer i) -> test.outputStr("Hello Lambda!" + i));
		
		boolean result = test.funcParams2((Integer i) -> true);
		System.out.println("result:" + result);
		
		boolean result2 = test.funcParams2((Integer i) -> {
			test.outputStr("Hello Lambda!" + i);
			return i == 1;
		});
		System.out.println("result2:" + result2);
	}
	
	private void func(FunctionInterface fi) {
		fi.testLambda();
	}
	
	private void funcParams(FunctionInterfaceParams<Integer> fi) {
		int i = 2;
		fi.testLambda(i);
	}
	
	private boolean funcParams2(FunctionInterfaceParams2<Integer> fi) {
		int i = 2;
		return fi.testLambda(i);
	}
	
	private void outputStr(String str) {
		System.out.println(str);
	}
}
