package ru.javavlad.start;

public class StubInput implements Input {
    private String[] answers;
    private int positions = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[positions++];
    }
}