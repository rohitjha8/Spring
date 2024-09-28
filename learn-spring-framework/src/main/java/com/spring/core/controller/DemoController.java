package com.spring.core.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    public String hello(){
        return "Hello this is contrller";
    }
}
