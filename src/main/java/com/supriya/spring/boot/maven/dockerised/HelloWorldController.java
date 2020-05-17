package com.supriya.spring.boot.maven.dockerised;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    
    @Autowired
    @GetMapping("/coal-mine")
        public String caranaryIsInTheCoalMine() {
            return "Tweet#";
        }

}