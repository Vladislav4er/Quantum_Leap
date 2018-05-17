package ru.javavlad.start;

public interface Input {

    String ask(String question);

    /**
     * Перегруженный метод ask.
     */
    int ask(String question, int[] range);

}
