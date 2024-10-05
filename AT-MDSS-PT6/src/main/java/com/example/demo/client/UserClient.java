package com.example.demo.client;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class UserClient {

    private final WebClient webClient;

    public UserClient(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    
    public Flux<User> getUsers() {
        return this.webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToFlux(User.class);
    }
}
