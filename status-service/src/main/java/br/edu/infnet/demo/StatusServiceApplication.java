package br.edu.infnet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StatusServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatusServiceApplication.class, args);
    }
}
