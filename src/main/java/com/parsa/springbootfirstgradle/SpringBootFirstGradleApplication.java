package com.parsa.springbootfirstgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//any object created by spring is called : bean
@SpringBootApplication
public class SpringBootFirstGradleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootFirstGradleApplication.class, args);

//        we want to let spring to create the object for us
        Alien alien = context.getBean(Alien.class);
        alien.code();

    }

}
