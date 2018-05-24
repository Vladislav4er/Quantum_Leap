package ru.javavlad.comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter @AllArgsConstructor
public class User implements Comparable<User> {
    private String name;
    private int age;

    @Override
    public int compareTo(User user) {
        return this.getAge() - user.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
