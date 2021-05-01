package com.lourenco;

public class CalculatorOperator {

    public double add(double op, double num1, double num2) {
        if (op == 1) {
            return num1 + num2;
        }
        return 0;
    }

    public double sub(double op, double num1, double num2) {
        if (op == 2) {
            return num1 - num2;
        }
        return 0;
    }


    public double mul(double op, double num1, double num2) {
        if (op == 3) {
            return num1 * num2;
        }
        return 0;
    }


    public double div(double op, double num1, double num2) {
        if (op == 4) {
            return num1 / num2;
        }
        return 0;
    }
}

