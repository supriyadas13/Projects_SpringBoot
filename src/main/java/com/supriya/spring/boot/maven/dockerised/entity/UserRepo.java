package com.supriya.spring.boot.maven.dockerised.entity;

import com.supriya.spring.boot.maven.dockerised.model.UserObject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserObject, Long> {
    
}