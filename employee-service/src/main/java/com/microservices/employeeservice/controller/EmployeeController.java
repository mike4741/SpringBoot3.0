package com.microservices.employeeservice.controller;

import com.microservices.employeeservice.model.Employee;
import com.microservices.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger((EmployeeController.class));

    @Autowired
    EmployeeRepository employeeRepository ;

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        LOGGER.info("Employee add: {}",employee);
        return employeeRepository.add(employee);
    }


    @GetMapping
    public List<Employee> findAll(){
        LOGGER.info("Employee find");
        return  employeeRepository.findAll();
    }


    @GetMapping("/{id}")
    public  Employee findById( @PathVariable Long id){
        LOGGER.info("Employee find: id={}",id);
        return  employeeRepository.findById(id);

    }


    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable Long departmentId){
        LOGGER.info("Employee find: departmentId={}",departmentId);
        return  employeeRepository.findByDepartment(departmentId);

    }



}
