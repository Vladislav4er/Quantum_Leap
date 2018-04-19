package ru.javavlad.models;

import lombok.Getter;
import lombok.Setter;

public class Item {

    @Setter @Getter private String id;
    @Setter @Getter private String name;
    @Setter @Getter private String description;
    @Setter @Getter private long create;
    @Setter @Getter private String comment;

    public Item() {
    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }
}
