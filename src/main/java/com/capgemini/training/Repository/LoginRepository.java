package com.capgemini.training.Repository;

import com.capgemini.training.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity findByEmail(String email);

    UserEntity findByNameAndPassword(String name,String password);

    boolean existsByEmail(String email);
}
