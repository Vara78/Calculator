package pack;

public class Calculator {
    /*
        This program generates a functional calculator.
        Author: Eric
        Date: 2/19/2021

        // TODO: Add scanner and user friendly functions
        // TODO: Create GUI Tools
    */

    public Calculator() {}

    // Add method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide method
    public int divide(int a, int b) {
        return a / b;
    }

    // Remainder
    public int module(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println("5 + 7 = " + myCalculator.add(5, 7));
        System.out.println("45 - 11 = " + myCalculator.subtract(45, 11));
        System.out.println("2 * 12 = " + myCalculator.multiply(2, 12));
        System.out.println("30 / 3 = " + myCalculator.divide(30, 3));
        System.out.println("3 % 2 = " + myCalculator.module(3, 2));
    }
}
