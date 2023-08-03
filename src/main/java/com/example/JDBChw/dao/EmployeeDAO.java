package com.example.JDBChw.dao;

import com.example.JDBChw.model.Employee;

public interface EmployeeDAO {
    Employee findById(Integer id);

    void create(Employee employee);

    void deleteById(Integer id);
}
