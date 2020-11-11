package com.chris.lambda;

import com.chris.entities.Employee;
import com.chris.lambda.method.reference.EmployeeData;
import org.junit.Test;
import sun.font.TrueTypeFont;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author Lilun
 * @Date 2020-11-04 09:42
 * @Description
 **/
public class CollectorsTest {

    @Test
    public void toMap() {
        List<Employee> employeeList = EmployeeData.getEmployees();
        Map<Integer, Employee> collect = employeeList.parallelStream().collect(Collectors.toMap(Employee::getId, a -> a, (oldKey, newKey) -> newKey));

        for (Map.Entry<Integer, Employee> employeeEntry : collect.entrySet()) {
            System.out.println(employeeEntry.getKey() + ", " + employeeEntry.getValue());
        }

        Map<Integer, String> collect1 = employeeList.parallelStream().collect(Collectors.toMap(Employee::getId, Employee::getName, (oldKey, newKey) -> newKey));
        for (Map.Entry<Integer, String> employeeEntry : collect1.entrySet()) {
            System.out.println(employeeEntry.getKey() + ", " + employeeEntry.getValue());
        }
    }


    @Test
    public void partitonBy() {
        List<Employee> employees = EmployeeData.getEmployees();
        Map<Boolean, List<Employee>> map =
                employees.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() > 20000));
        System.out.println("True:" + map.get(Boolean.TRUE));
        System.out.println("False:" + map.get(Boolean.FALSE));

    }

}
