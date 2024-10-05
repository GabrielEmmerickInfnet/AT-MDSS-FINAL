package com.example.demo;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class DataLoader implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public DataLoader(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        itemRepository.deleteAll()
            .thenMany(Flux.just(
                new Item(null, "Item 1", "Description 1"),
                new Item(null, "Item 2", "Description 2"),
                new Item(null, "Item 3", "Description 3")
            ))
            .flatMap(itemRepository::save)
            .subscribe(System.out::println);
    }
}
