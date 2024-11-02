package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message="hello good morning have a  nice day";
        //SMSService smsService=new SMSService();
        //Message Sender uses Smsservice to send message
        //EmailService emailService=new EmailService();
        //i have commented this object creation so let spring framework do the job of object creation

//        MessageSender messageSender=new MessageSender(emailService);//this is dependent on messsage servide
//        messageSender.sendMessage(message);
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender= applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);





    }
}
