package ru.javavlad.models;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Item {

    private String id;
    private String name;
    private String description;
    private long create;
    private String comment;

    public Item() {
    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }
}
