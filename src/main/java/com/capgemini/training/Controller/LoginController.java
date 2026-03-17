package com.capgemini.training.Controller;

import com.capgemini.training.Service.LoginService;
import com.capgemini.training.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

    @Autowired
    LoginService service;

    @GetMapping("/")
    public String loginPage(){
        return "login.jsp";
    }

    @PostMapping("/login")
    public String validate(String name,String password){
        System.out.println(name);
        System.out.println(password);

        UserEntity user = service.validateUser(name,password);

        if(user != null){
            return "redirect:/allEmp";
        }else{
            return "error.jsp";
        }
    }

    @PostMapping("/register")
    public String register(String name,String email,String password){

        if(service.emailExists(email)){
            return "userexists.jsp";   // show error page
        }

        UserEntity user = new UserEntity();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        service.registerUser(user);

        return "login.jsp";
    }

    @GetMapping("/forgotpassword")
    public String forgotPasswordPage(){

        return "forgotPassword.jsp";
    }

    @PostMapping("/resetpassword")
    public String resetPassword(String email,String newpassword,String confirmpassword){

        if(newpassword.equals(confirmpassword)){

            service.updatePassword(email,newpassword);

            return "login.jsp";
        }

        return "forgotPassword.jsp";
    }
}