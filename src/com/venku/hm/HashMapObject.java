package com.venku.hm;

import com.venku.comparsion.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {

    public static void main(String[] args) {
        new HashMapObject().callMap();

    }

    private void callMap() {

        Employee e1 = new Employee("sathish","Emp-01");
        Employee e2 = new Employee("sathish","Emp-01");
        Employee e3 = new Employee("sathish","Emp-01");
        Map<Employee,Employee> employeeData = new HashMap<>();
        employeeData.put(e1,e1);
        employeeData.put(e2,e2);
        employeeData.put(e3,e3);
        employeeData.entrySet().forEach(stringEmployeeEntry -> System.out.println(stringEmployeeEntry.getKey() + "---" +
                stringEmployeeEntry.getValue()));

    }
}
