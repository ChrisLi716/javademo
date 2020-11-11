package com.chris.lambda.method.reference;

import com.chris.entities.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lilun
 * @Date 2020-11-02 17:24
 * @Description
 **/
public class EmployeeData {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Chris", 23, 23000.43));
        list.add(new Employee(2, "John", 48, 13000.85));
        list.add(new Employee(3, "Joffery", 48, 32000.52));
        list.add(new Employee(4, "Allan", 34, 15800.83));
        list.add(new Employee(5, "Hedy", 22, 25200.45));
        list.add(new Employee(6, "Ethan", 2, 22500.84));
        list.add(new Employee(7, "Chris", 13, 13000.43));

        return list;
    }
}
