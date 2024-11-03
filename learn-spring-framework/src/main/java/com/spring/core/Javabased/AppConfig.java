package com.spring.core.Javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.EmailSender")
public class AppConfig {
@Bean

  public   DataSource  PostgressSqlDataSource(){
      return new PostgressSqlDataSource();
  }
  @Bean
  public DataSource MySqlDataSource(){
      return new MySqlDataSource();
  }
  @Bean
public EmailService emailService(){
    return new EmailService(PostgressSqlDataSource());
}

}
