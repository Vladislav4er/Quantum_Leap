package ru.javavlad.Strategy;

public class Triangle implements Shape {

    public String pic() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   \n");
        pic.append(" +   + \n");
        pic.append("+ + + +\n");
        return pic.toString();
    }
}
