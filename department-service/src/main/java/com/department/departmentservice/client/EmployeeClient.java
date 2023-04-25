package com.department.departmentservice.client;

import com.department.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeClient {

    @GetMapping("employee/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable Long departmentId);
}
