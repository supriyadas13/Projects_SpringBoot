package com.supriya.spring.boot.maven.dockerised.entity;

import com.supriya.spring.boot.maven.dockerised.model.TaskObject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<TaskObject, Long> {
    
}