package com.company;

public class Main {

    public static void main(String[] args) {
        double Test = 255.0;
        System.out.println("Direct Assignment: " + Test);

        Test = 2.55e2;
        System.out.println("Scientific Notation: " + Test);

        Test = 2.55e-2;
        System.out.println("Negative Exponent: " + Test);
    }
}
