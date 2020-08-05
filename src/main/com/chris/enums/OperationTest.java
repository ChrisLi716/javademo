package com.chris.enums;

/**
 * @Auther Chris Lee
 * @Date 1/3/2019 12:30
 * @Description
 */
public class OperationTest {
    public static void main(String[] args) {
        for (Operation_V1 v1 : Operation_V1.values()) {
            System.out.println(v1.apply(10, 2));
        }

        for (Operation_V2 v2 : Operation_V2.values()) {
            System.out.println(v2.apply(10, 2));
        }
    }
}
