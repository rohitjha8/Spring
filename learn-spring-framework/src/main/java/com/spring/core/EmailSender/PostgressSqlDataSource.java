package com.spring.core.EmailSender;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgressSqlDataSource implements DataSource{

    @Override
    public String[] getEmails() {
        String [] emails={"jha@gmail.com","robin@gmail.xcom"};
        return emails;
    }
}
