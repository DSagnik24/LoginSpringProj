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

    public void saveEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(int id, Employee updatedEmp){

        Employee existingEmp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existingEmp.setEmpName(updatedEmp.getEmpName());
        existingEmp.setEmpEmail(updatedEmp.getEmpEmail());
        existingEmp.setEmpContactNumber(updatedEmp.getEmpContactNumber());
        existingEmp.setEmpCity(updatedEmp.getEmpCity());

        return employeeRepository.save(existingEmp);
    }


    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }
}