package com.spring.core.Javabased;



public class PostgressSqlDataSource implements DataSource {

    @Override
    public String[] getEmails() {
        String [] emails={"jha@gmail.com","robin@gmail.xcom"};
        return emails;
    }
}
