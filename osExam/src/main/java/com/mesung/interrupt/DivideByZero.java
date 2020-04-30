package com.mesung.interrupt;

public class DivideByZero {

    public static void main(String [] args) {
        divideByZero();
    }

    public static int divideByZero() {
        System.out.println("hello");
        int data;
        int divider = 0;
        data = 1 / divider;
        return 0;
    }
}
