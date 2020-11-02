package com.chris.lambda.method.reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Lilun
 * @Date 2020-11-02 16:26
 * @Description
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    Employee(int id) {
        this.id = id;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;
    private int age;
    private double salary;


}
