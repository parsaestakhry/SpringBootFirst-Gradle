package com.parsa.springbootfirstgradle;


import org.springframework.stereotype.Component;


// telling spring to create the object
@Component
public class Alien {
    public void code() {
        System.out.println("coding");
    }
}
