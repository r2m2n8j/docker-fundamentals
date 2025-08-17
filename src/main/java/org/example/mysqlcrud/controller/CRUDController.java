package org.example.mysqlcrud.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.example.mysqlcrud.model.Employee;
import org.example.mysqlcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class CRUDController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // public CRUDController(EmployeeRepository employeeRepository){
    //     this.employeeRepository = employeeRepository;
    // }

    @PostMapping("/insert")
    public Employee saveEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
    
    
    
}
