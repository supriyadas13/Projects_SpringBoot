package com.supriya.spring.boot.maven.dockerised.controller;

import java.util.List;

import com.supriya.spring.boot.maven.dockerised.entity.TaskRepo;
import com.supriya.spring.boot.maven.dockerised.model.TaskObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/to-do")
public class ToDoController {
    
    @Autowired
    private TaskRepo taskRepo;


    @GetMapping("/")
        public List<TaskObject> getAllTasks(){
            return taskRepo.findAll();
        }
    
 
    @PostMapping("/")
        public TaskObject addTask(@RequestBody TaskObject taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }

    @PutMapping("/")
        public TaskObject updateTask(@RequestBody TaskObject taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }
    
    @DeleteMapping("/")
        public TaskObject deleteTask(@RequestBody TaskObject taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }

}