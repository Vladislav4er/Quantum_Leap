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
}
