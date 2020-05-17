package com.supriya.spring.boot.maven.dockerised.controller;

import com.supriya.spring.boot.maven.dockerised.model.HelloWorldObject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    
    @GetMapping("coal-mine")
        public String canaryIsInTheCoalMine() {
            return "Tweet#";
        }

    @GetMapping("hello")
        public  HelloWorldObject getObject(){
            return new HelloWorldObject();
    }

    @GetMapping("hello/{name}")
        public  HelloWorldObject getObject(@PathVariable String name){
            return new HelloWorldObject(name);
    }
    
    @GetMapping("hello-o")
        public String hello() {
            return "value : Hello World";
        }

    @GetMapping("hello-o/{name}")
        public String helloName(@PathVariable String name){
            return "Hello" + name;
    }
    


}