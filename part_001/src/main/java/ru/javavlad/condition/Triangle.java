package ru.javavlad.condition;

/**
 * Triangle Class.
 * @author Vlad
 * @version 1.00
 * @since 27.08.2018
 */

public class Triangle {
    /**
     * Point a variable.
     */
    private Point a;
    /**
     * Point b variable.
     */
    private Point b;
    /**
     * Point c variable.
     */
    private Point c;

    /**
     * Triangle coordinates setup.
     * @param a - a point
     * @param b - b point
     * @param c - c point
     */

    public void triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Triangle side length calculating.
     * @param d first point
     * @param e second point
     * @return length
     */

    public double side(Point d, Point e) {
        return Math.sqrt(Math.pow((e.getX() - d.getX()), 2) + Math.pow((e.getY() - d.getY()), 2));
    }

    /**
     * Triangle area calculating.
     * @return area
     */

    public double area() {
        double result = 0;
        double sideAB = this.side(a, b);
        double sideBC = this.side(b, c);
        double sideAC = this.side(a, c);

        if ((sideAB < (sideBC + sideAC)) && (sideBC < (sideAC + sideAB)) && (sideAC < (sideBC + sideAC))) {
            result = 0.5 * Math.abs(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY()));
        } else {
            System.out.println("Треугольника не существует");
        }
        return result;
    }
}

