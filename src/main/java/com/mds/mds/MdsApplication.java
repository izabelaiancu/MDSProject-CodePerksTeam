package com.mds.mds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class MdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdsApplication.class, args);
        System.out.println("merge");
    }


}
