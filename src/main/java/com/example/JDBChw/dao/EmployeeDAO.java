package com.example.JDBChw.dao;

import com.example.JDBChw.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee findById(Integer id);

    void create(Employee employee);

    void deleteById(Integer id);

    List<Employee> findAll();

    //void changeById(Integer id);
}
