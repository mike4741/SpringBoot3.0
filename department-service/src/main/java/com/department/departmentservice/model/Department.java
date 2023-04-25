package com.department.departmentservice.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String departmentName;
    private List<Employee> employeeList = new ArrayList<>();

    public Department() {
    }

//    public Department(Long id, String departmentName) {
//        this.id = id;
//        this.departmentName = departmentName;
//    }

    public Department(Long id, String departmentName, List<Employee> employeeList) {
        this.id = id;
        this.departmentName = departmentName;
        this.employeeList = employeeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
