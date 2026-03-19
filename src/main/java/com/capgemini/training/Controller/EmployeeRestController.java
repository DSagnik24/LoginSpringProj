package com.capgemini.training.Controller;

import com.capgemini.training.Entity.Employee;
import com.capgemini.training.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class EmployeeRestController {

    @Autowired
    EmployeeService service;

    @GetMapping("allEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(service.getAllEmployees());
    }

    @GetMapping("employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id){
        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    @PostMapping("createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
        service.saveEmployee(emp);
        return ResponseEntity.status(201).body(emp);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable int id,
            @RequestBody Employee emp){

        return ResponseEntity.ok(service.updateEmployee(id, emp));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }

    @GetMapping("search/{name}")
    public ResponseEntity<List<Employee>> search(@PathVariable String name){
        return ResponseEntity.ok(service.searchByName(name));
    }
}