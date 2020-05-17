package com.supriya.spring.boot.maven.dockerised.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void canaryIsInTheCoalMineTest(){
        try{
        mockMvc.perform(get("/coal-mine"))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(content()
        .string("Tweet#"));
        } catch (Exception e){
            fail("exception : "+e.getLocalizedMessage());
        }
    }
    

    @Test
    public void getdefaultJson(){
        try{
        mockMvc.perform(get("/hello"))
        .andDo(print())
        .andExpect(status()
        .isOk())
        .andExpect(jsonPath("$.value").value("Hello World"));
        } catch (Exception e){
            fail("exception : "+e.getLocalizedMessage());
        }
    }

    @Test
    public void getdefauktJsonName(){
        try{
            mockMvc.perform(get("/hello/name"))
            .andDo(print())
            .andExpect(status()
            .isOk())
            .andExpect(jsonPath("$.value").value("Hello name"));
            } catch (Exception e){
                fail("exception : "+e.getLocalizedMessage());
            }
    }

}