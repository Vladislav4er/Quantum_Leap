package ru.javavlad.comparator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {

    @Test
    public void usersHaveDifferentAgeThenSortByAge() {
        List<User> users = new ArrayList<>();
        SortUser sortedUsers = new SortUser();
        users.add(new User("Den", 30));
        users.add(new User("John", 20));
        users.add(new User("Natali", 31));
        Set<User> result = sortedUsers.sort(users);

        Set<User> expect = new TreeSet<>();
        expect.add(new User("Den", 30));
        expect.add(new User("John", 20));
        expect.add(new User("Natali", 31));

        assertThat(result, is(expect));
    }

    @Test
    public void usersSortByNameLength() {
        List<User> users = new ArrayList<>();
        SortUser sortedUsers = new SortUser();
        users.add(new User("Den", 30));
        users.add(new User("Johnoton", 20));
        users.add(new User("Natali", 31));
        List<User> result = sortedUsers.sortNameLength(users);

        List<User> expect = new ArrayList<>();
        expect.add(new User("Den", 30));
        expect.add(new User("Natali", 31));
        expect.add(new User("Johnoton", 20));

        assertThat(result, is(expect));
    }

    @Test
    public void usersSortByNameAndAge() {
        List<User> users = new ArrayList<>();
        SortUser sortedUsers = new SortUser();
        users.add(new User("Сергей", 25));
        users.add(new User("Иван", 30));
        users.add(new User("Сергей", 20));
        users.add(new User("Иван", 25));
        List<User> result = sortedUsers.sortByAllFields(users);

        List<User> expect = new ArrayList<>();
        expect.add(new User("Иван", 25));
        expect.add(new User("Иван", 30));
        expect.add(new User("Сергей", 20));
        expect.add(new User("Сергей", 25));

        assertThat(result, is(expect));
    }


}
