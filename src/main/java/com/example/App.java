package com.example;

public class App {
    public String greet() {
        return "Hello, World!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greet());
        System.out.println("2 + 3 = " + app.add(2, 3));
        System.out.println("5 - 3 = " + app.subtract(5, 3));
        System.out.println("4 * 5 = " + app.multiply(4, 5));
        System.out.println("10 / 2 = " + app.divide(10, 2));
    }
}
