package com.capgemini.training.Service;

import com.capgemini.training.Entity.Employee;
import com.capgemini.training.Exception.EmployeeNotFoundException;
import com.capgemini.training.Exception.InvalidInputException;
import com.capgemini.training.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(Employee emp){

        if(emp.getEmpName() == null || emp.getEmpName().isEmpty()){
            throw new InvalidInputException("Employee name cannot be empty");
        }

        employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(int id, Employee updatedEmp){

        Employee existingEmp = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID " + id + " not found"));

        existingEmp.setEmpName(updatedEmp.getEmpName());
        existingEmp.setEmpEmail(updatedEmp.getEmpEmail());
        existingEmp.setEmpContactNumber(updatedEmp.getEmpContactNumber());
        existingEmp.setEmpCity(updatedEmp.getEmpCity());

        return employeeRepository.save(existingEmp);
    }


    public void deleteEmployee(int id){

        if(!employeeRepository.existsById(id)){
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found");
        }

        employeeRepository.deleteById(id);
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public List<Employee> searchByName(String name){

        List<Employee> list = employeeRepository.findByEmpNameContainingIgnoreCase(name);

        if(list.isEmpty()){
            throw new EmployeeNotFoundException("No employees found with name: " + name);
        }

        return list;
    }


}