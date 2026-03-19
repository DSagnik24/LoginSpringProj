package com.capgemini.training.Controller;


import com.capgemini.training.Entity.Employee;
import com.capgemini.training.Service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

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

        return "home";
    }

    @GetMapping("/addEmp")
    public String showAddEmpPage(){
        return "register-emp";
    }


    @PostMapping("/addEmp")
    public String saveEmployee(Employee emp){

        service.saveEmployee(emp);

        return "redirect:/allEmp";
    }

    @PostMapping("/updateEmp")
    public String updateEmployee(@RequestParam int id, Employee emp){

        service.updateEmployee(id, emp);

        return "redirect:/allEmp";
    }

    @GetMapping("/deleteEmp/{id}")
    public String deleteEmployee(@PathVariable int id){

        service.deleteEmployee(id);

        return "redirect:/allEmp";
    }

    @GetMapping("/editEmp/{id}")
    public String editEmployee(@PathVariable int id, HttpServletRequest request){

        Employee emp = service.getEmployeeById(id);
        request.setAttribute("emp", emp);

        return "edit-emp";
    }




        @GetMapping("/view-emp/{id}")
        public String viewEmp(@PathVariable int id, Model model){
            Employee emp = service.getEmployeeById(id);
            model.addAttribute("emp", emp);
            return "view-emp";
        }

    @GetMapping("/searchEmp")
    public String searchEmployee(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false) String name,
            HttpServletRequest request){

        if(id != null){
            Employee emp = service.getEmployeeById(id);

            if(emp != null){
                request.setAttribute("emplist", List.of(emp));
            } else {
                request.setAttribute("message", "Employee not found!");
            }

        } else if(name != null && !name.isEmpty()){
            List<Employee> list = service.searchByName(name);

            if(list.isEmpty()){
                request.setAttribute("message", "No employees found!");
            } else {
                request.setAttribute("emplist", list);
            }
        }

        return "home";
    }
}