package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {


    public static void main(String[] args) {
//        Vehicle vehicle=new Bike();

//        Traveller traveller=new Traveller(vehicle);
//        traveller.startJourney();

        //creating spring Ioc container
        //REad the configuration claass
        //Based on the class create and manage beans

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        //Retreive spring bean from spring Ioc Container
       Car car= applicationContext.getBean(Car.class);
       car.move();
       Traveller traveller=applicationContext.getBean(Traveller.class);
       traveller.startJourney();
    }
}
