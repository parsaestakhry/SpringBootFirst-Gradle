package com.parsa.springbootfirstgradle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// telling spring to create the object
@Component
public class Alien {

    @Autowired // means connect it to the bean which is the laptop class
    Laptop laptop;
    public void code() {
        laptop.compile();
    }
}
