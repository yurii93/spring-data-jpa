package com.yuravashchenko.spring.springboot.spring_data_jpa.controller;

import com.yuravashchenko.spring.springboot.spring_data_jpa.entity.Employee;
import com.yuravashchenko.spring.springboot.spring_data_jpa.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    private final EmployeeService employeeService;

    public MyRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee showEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> showAllEmployeesByName(@PathVariable String name) {
        return employeeService.finAllByName(name);
    }
}
