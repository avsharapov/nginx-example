package ru.stc.inno.simpleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleAppApplication {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String home() {
        String name = env.getProperty("NAME");
        System.out.println("==============================");
        System.out.println("Server " + name + " requested.");
        System.out.println("==============================");
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleAppApplication.class, args);
    }

}