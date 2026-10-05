package com.example.saveUP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saveUP.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
