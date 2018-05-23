package ru.javavlad.list;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id
                && Objects.equals(name, user.name)
                && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, city);
    }
}
