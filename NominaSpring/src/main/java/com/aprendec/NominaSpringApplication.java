package com.aprendec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.aprendec"})
@EntityScan(basePackages = {"com.aprendec.empleado"})
public class NominaSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(NominaSpringApplication.class, args);
    }
}
