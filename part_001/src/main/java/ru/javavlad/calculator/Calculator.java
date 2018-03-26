package ru.javavlad.calculator;

/**
 * Calculator.
 * @author Vlad
 * @version 1.00
 * @since 26.08.2018
 */
public class Calculator {

    /**
     * Result variable.
     */
   private double result;

    /**
     * Sum of 2 numbers.
     * @param first - first number
     * @param second - second number
     */

   public void add(double first, double second) {
       this.result = first + second;
   }

    /**
     * Substruct of 2 numbers.
     * @param first - first number
     * @param second - second number
     */
    public void sub(double first, double second) {
        this.result = first - second;
    }

    /**
     * Division of 2 numbers.
     * @param first - first number
     * @param second - second number
     */

    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Multiplication of 2 numbers.
     * @param first - first number
     * @param second - second number
     */

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Return result of operation.
     * @return result
     */
    public double getResult() {
        return this.result;
    }
}
