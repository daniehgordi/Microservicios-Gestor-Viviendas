package com.gestor.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages="com.gestor.model")
@EnableJpaRepositories(basePackages="com.gestor.dao")
@SpringBootApplication(scanBasePackages={"com.gestor.controller","com.gestor.service"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }   

}