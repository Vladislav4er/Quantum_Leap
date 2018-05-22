package ru.javavlad.search;

import lombok.Getter;

@Getter
public class Task {

    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }
}
