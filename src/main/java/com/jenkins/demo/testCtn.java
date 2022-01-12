package com.jenkins.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testCtn {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
