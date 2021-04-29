package com.lourenco;

public class Calculator {
    /*public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int substract(int number1, int number2){
        return number1 - number2;
    }

    public int multiply(int number1, int number2){
        return number1 * number2;
    }

    public int divide(int number1, int number2){
        return number1 / number2;
    }*/

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double sub(double number1, double number2) {
        return number1 - number2;
    }

    public double mul(double number1, double number2) {
        return number1 * number2;
    }

    public double div(double number1, double number2) {
        if (number2 == 0) {
            System.err.println("You cannot divide by 0!");
            return 0;
        }
        return number1 / number2;
    }
}
