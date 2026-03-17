package com.capgemini.training.Controller;

import com.capgemini.training.Entity.Employee;
import com.capgemini.training.Service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/allEmp")
    public String getAllEmployees(HttpServletRequest request){

        List<Employee> listOfEmp = service.getAllEmployees();

        if(listOfEmp == null || listOfEmp.isEmpty()){
            request.setAttribute("emplist", null);
            request.setAttribute("message", "No employees found!");
        } else {
            request.setAttribute("emplist", listOfEmp);
        }

        return "home.jsp";
    }

    @GetMapping("/addEmp")
    public String showAddEmpPage(){
        return "register-emp.jsp";
    }


    @PostMapping("/addEmp")
    public String saveEmployee(Employee emp){

        System.out.println("Contact: " + emp.getEmpContactNumber()); // debug

        service.saveEmployee(emp);

        return "redirect:/allEmp";
    }
}