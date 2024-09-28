package com.spring.core.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Demorepository {
    public String hello(){
        return "hello this is repository class";
    }
}
