package com.lourenco;

import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String userName = scanner.nextLine();
        System.out.println(userName + " chose your operator:  ");
        double inputNumber1 = scanner.nextDouble();
        System.out.println("now enter your 1st number: ");
        double inputNumber2 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber3 = scanner.nextDouble();


        CalculatorOperator count = new CalculatorOperator();
        double result = count.add(inputNumber1, inputNumber2, inputNumber3);
        System.out.println(userName + " the sum of " + inputNumber2 + " + " + inputNumber3 + " = " + result + "\n");

        System.out.println("################################################################################");

        System.out.println(userName + " chose your operator:  ");
        double inputNumber4 = scanner.nextDouble();
        System.out.println("now enter your 1st number: ");
        double inputNumber5 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber6 = scanner.nextDouble();

        double result2 = count.sub(inputNumber4, inputNumber5, inputNumber6);
        System.out.println(userName + " the subtraction of " + inputNumber5 + " - " + inputNumber6 + " = " + result2 + "\n");

        System.out.println("################################################################################");

        System.out.println(userName + " chose your operator:  ");
        double inputNumber7 = scanner.nextDouble();
        System.out.println("now enter your 1st number: ");
        double inputNumber8 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber9 = scanner.nextDouble();

        double result3 = count.mul(inputNumber7, inputNumber8, inputNumber9);
        System.out.println(userName + " the multiplication of " + inputNumber8 + " x " + inputNumber9 + " = " + result3 + "\n");

        System.out.println("################################################################################");

        System.out.println(userName + " chose your operator:  ");
        double inputNumber10 = scanner.nextDouble();
        System.out.println("now enter your 1st number: ");
        double inputNumber11 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber12 = scanner.nextDouble();

        double result4 = count.div(inputNumber10, inputNumber11, inputNumber12);
        System.out.println(userName + " the division of " + inputNumber11 + " : " + inputNumber12 + " = " + result4 + "\n");
    }
}
