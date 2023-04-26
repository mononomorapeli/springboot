package com.Employee.employees.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.employees.system.models.Employees;

public interface EmployeesRepo extends JpaRepository<Employees, Integer>{
    
}
