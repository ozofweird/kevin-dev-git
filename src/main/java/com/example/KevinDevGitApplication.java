package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KevinDevGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(KevinDevGitApplication.class, args);

        System.out.println("test1");
        System.out.println("release 0.0.1");
        System.out.println("hotfix 0.0.2");
    }

}
