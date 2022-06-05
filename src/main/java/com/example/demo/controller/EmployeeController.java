package com.example.demo.controller;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository repository;

    @GetMapping("")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @PostMapping("")
    public Employee saveEmployee() {
        return repository.save(Employee.builder().age(23).fullName("mert").build());
    }

    @GetMapping("/employee/{fullName}")
    public List<Employee> getEmployeeByName(@PathVariable String fullName) {
        List<Employee> employees = repository.findAllByFullName(fullName);
        return employees;
    }


}
