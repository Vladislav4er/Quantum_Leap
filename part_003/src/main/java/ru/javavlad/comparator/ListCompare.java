package ru.javavlad.comparator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {

    //Необходимо реализовать поэлементное сравнение двух списков, т.е.
    // сравниваем элементы двух списков, находящихся на одних и тех же позициях (по одним и
    // тем же индексом). Сравнение в лексикографическом порядке.

    @Override
    public int compare(String left, String right) {
        int result = 0;
        String minString = (left.length() < right.length()) ? left : right;
        for (int i = 0; i < minString.length(); i++) {
            if (Character.compare(left.charAt(i), right.charAt(i)) < 0) {
                result = -1;
                break;
            } else if (Character.compare(left.charAt(i), right.charAt(i)) > 0) {
                result = 1;
                break;
            }
        }
        if (result == 0) {
            result = left.length() - right.length();
        }
        return result;
    }
}
