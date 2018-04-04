package ru.javavlad.array;

/**
 * One word in other containing.
 * @author Vladislav4er
 * @version 1.00
 * @since 04.04.2018
 */

public class Containing {

    /**
     * Containing check method.
     * @param origin - first Word
     * @param sub - second word
     * @return contains information
     */

    static boolean contains(String origin, String sub) {
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        int count = 1;
        for (int i = 1; i < originArray.length; i++) {
            for (int j = 1; j < subArray.length; j++) {
                if ((originArray[i - 1] == subArray[j - 1]) && (originArray[i] == subArray[j])) {
                    count++;
                }
            }
        }
        return (count == subArray.length);
    }
}
