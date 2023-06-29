package com.example.calculatordemo;

public class Calculator {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double min(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("Không thể chia cho 0");
        }
        return a / b;
    }
}
