package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Traveller {


   private Vehicle vehicle  ;

    @Autowired
    public Traveller(@Qualifier("bike") Vehicle vehicle1){
        this.vehicle=vehicle1;

    }

    public void startJourney(){
        this.vehicle.move();

    }
}
