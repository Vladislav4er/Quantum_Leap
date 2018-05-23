package ru.javavlad.comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class User implements Comparable<User> {
    private String name;
    private int age;

    @Override
    public int compareTo(User user) {
        return this.getAge() - user.getAge();
    }
}
