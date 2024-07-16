package com.Aditya.CRUD.service;

import com.Aditya.CRUD.dao.EmployeeDao;
import com.Aditya.CRUD.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee){
       return employeeDao.save(employee);

    }

    public List<Employee> getEmployees(){
        List<Employee> employee = new ArrayList<>();
        employeeDao.findAll().forEach(employee::add);
        return employee;
    }

    public Employee getEmployee(Integer employeeId){
        return employeeDao.findById(employeeId).orElseThrow();
    }

    public void deleteEmployee(Integer employeeId){
      employeeDao.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee){
        employeeDao.findById(employee.getEmployeeId()).orElseThrow();
        return employeeDao.save(employee);
    }
}
