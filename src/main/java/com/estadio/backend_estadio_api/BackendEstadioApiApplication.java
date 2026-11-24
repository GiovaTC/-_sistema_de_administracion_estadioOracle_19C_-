package com.estadio.backend_estadio_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendEstadioApiApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(
                BackendEstadioApiApplication.class,
                args);

        System.out.println("SISTEMA DE ADMINISTRACION DE ESTADIO INICIADO!");
    }
}
