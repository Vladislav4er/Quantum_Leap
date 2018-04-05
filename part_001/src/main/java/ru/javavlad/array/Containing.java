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
     *
     * @param origin - first Word
     * @param sub    - second word
     * @return contains information
     */

    static boolean contains(String origin, String sub) {
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        boolean result = false;
        int count;
        for (int i = 0; i <= originArray.length - subArray.length; i++) {
            if (originArray[i] == subArray[0]) {
                count = 0;
                for (int j = 0; j < subArray.length; j++) {
                    if (originArray[i + j] == subArray[j]) {
                        count++;
                    }
                }
                if (count == subArray.length) {
                    result = true;
                }
            }
        }
        return result;
    }
}
