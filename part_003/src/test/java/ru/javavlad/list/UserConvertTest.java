package ru.javavlad.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void listHasTwoPersonsThenConvertThemToHashMap() {
        UserConvert convert = new UserConvert();
        List<User> list = new ArrayList<>();
        User user1 = new User(1, "Name1", "City1");
        User user2 = new User(2, "Name2", "City2");
        list.add(user1);
        list.add(user2);
        HashMap<Integer, User> result = convert.process(list);
        HashMap<Integer, User> expect = new HashMap<>();
        expect.put(1, user1);
        expect.put(2, user2);
        assertThat(result, is(expect));
    }
}
