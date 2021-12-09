package com.venku.comparsion;

import java.util.Objects;

public class Employee {

    private String name;

    private String empId;

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        System.out.println("equals called");
        boolean firstCondition = Objects.equals(getName(), employee.getName());
        boolean secondCondition  = Objects.equals(getEmpId(), employee.getEmpId());
        System.out.println("conditions"+ firstCondition + "---"+ secondCondition);
        return  firstCondition && secondCondition;

    }

    @Override
    public int hashCode() {
        int hashCode = Objects.hash(getName(), getEmpId());
        System.out.println(hashCode);
        return hashCode;
    }
}
