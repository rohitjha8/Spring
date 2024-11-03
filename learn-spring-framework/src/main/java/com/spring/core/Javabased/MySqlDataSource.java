package com.spring.core.Javabased;

import org.springframework.stereotype.Component;


public class MySqlDataSource implements DataSource {
    @Override
    public String[] getEmails() {

        String[] emails={"rohit@gmial.com","rithik@gmail.com"};
        return emails;
    }
}
