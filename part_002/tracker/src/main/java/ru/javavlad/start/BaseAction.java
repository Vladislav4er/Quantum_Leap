package ru.javavlad.start;

public abstract class BaseAction implements UserAction {
    private int key;
    private String name;

    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }

    @Override
    public int key() {
        return this.key;
    }
}
