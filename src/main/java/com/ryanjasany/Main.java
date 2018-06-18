package com.ryanjasany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ryanjasany.Dao")
@SpringBootApplication
public class Main {

    public static void main(String[] args){

        SpringApplication.run(Main.class, args);

    }

}
