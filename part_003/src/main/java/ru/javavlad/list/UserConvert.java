package ru.javavlad.list;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UserConvert {

    public HashMap<Integer, User> process(List<User> list) {
        return list.stream().collect(Collectors
                            .toMap(u -> u.getId(), u -> u, (u1, u2) -> u2, HashMap::new));
    }
}
