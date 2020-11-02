package com.chris.lambda.method.reference;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造器引用
 **/
public class ConstructorRefTest {

    /**
     * Supplier的 T get();
     * Employee的 new Employee()
     */
    @Test
    public void test1() {
        Supplier<Employee> supplier = () -> new Employee();
        Employee emp = supplier.get();
        System.out.println(emp);

        Supplier<Employee> supplier1 = Employee::new;
        System.out.println(supplier1.get());
    }

    /**
     * Function的 R apply(T t);;
     * Employee的 new Employee(int id)
     */
    @Test
    public void test2() {
        Function<Integer, Employee> function = id -> new Employee(id);
        System.out.println(function.apply(121));

        Function<Integer, Employee> function1 = Employee::new;
        System.out.println(function1.apply(141));
    }
}
