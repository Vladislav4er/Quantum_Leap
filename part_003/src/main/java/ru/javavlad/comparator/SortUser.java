package ru.javavlad.comparator;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> users) {
        return new TreeSet<>(users);
    }

    //в этом методе необходимо определить Comparator для метода
    //Collections.sort и отсортировать List<User> по
    //длине имени.

    public List<User> sortNameLength(List<User> user) {
        Collections.sort(user, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getName().length() - u2.getName().length();
            }
        });
        return user;
    }

    //в этом методе необходимо определить Comparator для метода Collections.sort
    // и отсортировать List<User> по обоим полям, сначала сортировка по имени
    // в лексикографическом порядке, потом по возрасту.

    public List<User> sortByAllFields(List<User> user) {
        Collections.sort(user, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                int flag = u1.getName().compareTo(u2.getName());
                if (flag == 0) {
                    flag = u1.getAge() - u2.getAge();
                }
                return flag;
            }
        });
        return user;
    }
}