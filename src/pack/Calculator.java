package pack;

public class Calculator {
    /*
        This program generates a functional calculator.
        Author: Eric
        Date: 2/19/2021

        // TODO: Add scanner and user friendly functions
        // TODO: Create GUI Toolss
    */

    // Add method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtract method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Divide method
    public static int divide(int a, int b) {
        return a / b;
    }

    // Remainder
    public static int module(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println("5 + 7 = " + add(5, 7));
        System.out.println("45 - 11 = " + subtract(45, 11));
        System.out.println("2 * 12 = " + multiply(2, 12));
        System.out.println("30 / 3 = " + divide(30, 3));
        System.out.println("3 % 2 = " + module(3, 2));
    }
}
