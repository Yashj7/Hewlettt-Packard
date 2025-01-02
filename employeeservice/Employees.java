package com.example.employeeservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public Employees() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Manager"));
        employeeList.add(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Developer"));
        employeeList.add(new Employee("3", "Alice", "Johnson", "alice.johnson@example.com", "Designer"));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
