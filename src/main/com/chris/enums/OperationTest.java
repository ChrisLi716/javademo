package com.chris.enums;

/**
 * @Auther Chris Lee
 * @Date 1/3/2019 12:30
 * @Description
 */
public class OperationTest {
    public static void main(String[] args) {
        /*for (Operation_V1 v1 : Operation_V1.values()) {
            System.out.println(v1.name() + ", " + v1.apply(10, 2));
        }

        for (Operation_V2 v2 : Operation_V2.values()) {
            System.out.println(v2.name() + ", " + v2.apply(10, 2));
        }

        for (Operation_V3 v3 : Operation_V3.values()) {
            System.out.println(v3.name() + ", " + v3.getSymbol() + ", " + v3.apply(10, 2));
        }*/

        for (Operation_Lambda v_lambda : Operation_Lambda.values()) {
            System.out.println(v_lambda.name() + ", " + v_lambda.getSymbol() + ", " + v_lambda.apply(10, 2));
        }
    }


}
