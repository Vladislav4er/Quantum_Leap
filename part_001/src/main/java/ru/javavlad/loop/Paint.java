package ru.javavlad.loop;

/**
 * Pyramid.
 * @author Vladislav4er
 * @version 1.00
 * @since 29.03.2018
 */

public class Paint {

    /**
     * Pyramid building.
     * @param h height of board
     * @return pyramid in string format
     */

    public String pyramid(int h) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= (2 * h - 1); j++) {
                if ((j <= h - i) || (j >= h + i)) {
                    builder.append(" ");
                } else {
                    builder.append("^");
                }
            }
            if (i < h) {
                builder.append("\r\n");
            }
        }
        return builder.toString();
    }
}
