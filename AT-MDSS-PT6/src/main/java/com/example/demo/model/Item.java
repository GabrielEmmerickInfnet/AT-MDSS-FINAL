package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("items")  // Nome da tabela
public class Item {

    @Id
    private Long id;
    private String name;
    private String description;

    // Construtor padrão
    public Item() {
    }

    // Construtor com parâmetros
    public Item(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getter para id
    public Long getId() {
        return id;
    }

    // Setter para id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para name
    public String getName() {
        return name;
    }

    // Setter para name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para description
    public String getDescription() {
        return description;
    }

    // Setter para description
    public void setDescription(String description) {
        this.description = description;
    }

    // Método toString para facilitar a visualização dos dados
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
