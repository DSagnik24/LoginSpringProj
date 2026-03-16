package com.capgemini.training;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity findByEmail(String email);

    UserEntity findByNameAndPassword(String name,String password);
}
