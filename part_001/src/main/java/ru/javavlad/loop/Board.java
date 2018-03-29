package ru.javavlad.loop;

/**
 * Board.
 * @author Vladislav4er
 * @version 1.00
 * @since 29.03.2018
 */

public class Board {

    /**
     * Chessboard builder method.
     * @param width - width of board
     * @param height - height of board
     * @return String board
     */

    public String paint(int width, int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    builder.append("X");
                } else {
                    builder.append(" ");
                }
            }
        builder.append("\r\n");
        }
        return builder.toString();
    }
}
