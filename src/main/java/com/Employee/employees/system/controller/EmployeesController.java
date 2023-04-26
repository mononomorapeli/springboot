package com.Employee.employees.system.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.employees.system.models.Employees;
import com.Employee.employees.system.repo.EmployeesRepo;

@RestController
@RequestMapping (value ="/employees")
public class EmployeesController {

@Autowired private EmployeesRepo employeeRepo;

@GetMapping
    public List<Employees> getEmployees() {
        return employeeRepo.findAll();
    }
 @PostMapping
    public Employees save(@Validated @NonNull @RequestBody Employees employees){
        return employeeRepo.save (employees);
    }
@GetMapping(value="/{id}")
    public Optional<Employees>findOne(int id){
        return employeeRepo.findById(id);
    }
@PutMapping("{employeeId}")
    public Employees update(@Validated @NonNull @RequestBody  Employees employees ){
        return employeeRepo.save(employees);
        
    }
    
    
    
}
