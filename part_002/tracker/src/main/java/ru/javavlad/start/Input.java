package ru.javavlad.start;

import java.util.List;

public interface Input {

    String ask(String question);

    /**
     * Перегруженный метод ask.
     */
    int ask(String question, List<Integer> range);

}
