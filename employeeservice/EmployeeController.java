package com.example.employeeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final Employees employees;

    public EmployeeController() {
        this.employees = new Employees();
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees.getEmployeeList();
    }
}
