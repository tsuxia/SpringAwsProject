package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GO go go, Nate ! @ 2017-09-18.
 */
@RestController
public class StatusController {

    @GetMapping(name="/status")
    public String getStatus(){

        return "hello world";
    }
}
