package com.capgemini.training.Service;

import com.capgemini.training.Entity.Employee;
import com.capgemini.training.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    // CREATE
    public void saveEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    // READ ALL
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


}