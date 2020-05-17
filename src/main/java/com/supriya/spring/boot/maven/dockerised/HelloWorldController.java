package com.supriya.spring.boot.maven.dockerised;

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
        public String hello() {
            return "value : Hello World";
        }

    @GetMapping("hello/{name}")
        public String helloName(@PathVariable String name){
            return "Hello" + name;
    }
    

}