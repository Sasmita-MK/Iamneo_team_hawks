package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    List<User> findByEmail(String email);
}
