package com.capgemini.training;

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
    public String validate(String email,String password){

        UserEntity user = service.validateUser(email,password);

        if(user!=null){
            return "home.jsp";
        }

        return "login.jsp";
    }

    @PostMapping("/register")
    public String register(String name,String email,String password){

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