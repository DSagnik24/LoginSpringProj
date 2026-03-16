package com.capgemini.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository repo;

    public void registerUser(UserEntity user){
        repo.save(user);
    }

    public UserEntity validateUser(String email, String password){
        return repo.findByEmailAndPassword(email,password);
    }

    public UserEntity getUserByEmail(String email){
        return repo.findByEmail(email);
    }

    public void updatePassword(String email, String password){
        UserEntity user = repo.findByEmail(email);

        if(user != null){
            user.setPassword(password);
            repo.save(user);
        }
    }
}
