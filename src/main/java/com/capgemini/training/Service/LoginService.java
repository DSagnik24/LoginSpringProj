package com.capgemini.training.Service;

import com.capgemini.training.Repository.LoginRepository;
import com.capgemini.training.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository repo;

    public void registerUser(UserEntity user){
        repo.save(user);
    }

    public UserEntity validateUser(String name, String password){
        return repo.findByNameAndPassword(name,password);
    }

    public UserEntity getUserByEmail(String email){
        return repo.findByEmail(email);
    }

    public boolean emailExists(String email){
        return repo.existsByEmail(email);
    }

    public void updatePassword(String email, String password){
        UserEntity user = repo.findByEmail(email);

        if(user != null){
            user.setPassword(password);
            repo.save(user);
        }
    }
}
