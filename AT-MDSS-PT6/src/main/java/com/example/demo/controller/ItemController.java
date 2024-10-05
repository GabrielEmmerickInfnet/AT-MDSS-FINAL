package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    // Endpoint GET para retornar todos os itens
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)  // Usa um fluxo de eventos para resposta reativa
    public Flux<Item> getAllItems() {
        return itemRepository.findAll();
    }

    // Endpoint POST para criar um novo item
    @PostMapping
    public Mono<Item> createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }
}
