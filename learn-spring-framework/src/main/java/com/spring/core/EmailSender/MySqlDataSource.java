package com.spring.core.EmailSender;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataSource implements DataSource{
    @Override
    public String[] getEmails() {

        String[] emails={"rohit@gmial.com","rithik@gmail.com"};
        return emails;
    }
}
