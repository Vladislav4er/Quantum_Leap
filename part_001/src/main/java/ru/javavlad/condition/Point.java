package ru.javavlad.condition;

/**
 * Point Class.
 * @author Vlad
 * @version 1.00
 * @since 27.08.2018
 */

public class Point {
    /**
     * X coordinate variable.
     */
    private int x;

    /**
     * Y coordinate variable.
     */
    private int y;

    /**
     * Point coordinates setup.
     * @param x - x coordinate
     * @param y - y coordinate
     */

    public void point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * X coordinate getting.
     * @return x coordinate
     */

    public int getX() {
        return this.x;
    }

    /**
     * Y coordinate getting.
     * @return y coordinate
     */

    public int getY() {
        return this.y;
    }

    /**
     * Point on line or not on line.
     * @param a - a constant
     * @param b - b constant
     * @return position information
     */

    public boolean is(int a, int b) {
        return (y == a * x + b);
    }

}
