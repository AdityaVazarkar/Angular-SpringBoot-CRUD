package com.Aditya.CRUD.dao;

import com.Aditya.CRUD.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends CrudRepository<Employee , Integer> {
}
