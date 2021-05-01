package com.lourenco;

import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        CalculatorOperator count = new CalculatorOperator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scanner.nextLine();
        while (true) {
            System.out.println(userName + " chose your operator: ");
            System.out.println("enter 1 for add");
            System.out.println("enter 2 for sub");
            System.out.println("enter 3 for mul");
            System.out.println("enter 4 for div");
            byte operator = scanner.nextByte();
            System.out.println("now enter your 1st number: ");
            double inputNumber1 = scanner.nextDouble();
            System.out.println("now enter your 2nd number: ");
            double inputNumber2 = scanner.nextDouble();

            if (operator == 1) {
                double result = count.add(inputNumber1, inputNumber2);
                System.out.println(userName + " the sum of " + inputNumber1 + " + " + inputNumber2 + " = " + result);
            } else if (operator == 2) {
                double result1 = count.sub(inputNumber1, inputNumber2);
                System.out.println(userName + " the subtraction of " + inputNumber1 + " - " + inputNumber2 + " = " + result1);
            } else if (operator == 3) {
                double result2 = count.mul(inputNumber1, inputNumber2);
                System.out.println(userName + " the multiplication of " + inputNumber1 + " x " + inputNumber2 + " = " + result2);
            } else if (operator == 4) {
                if (inputNumber2 == 0) {
                    System.err.println("You cannot divide by 0!");
                    System.exit(0);
                }
                double result3 = count.div(inputNumber1, inputNumber2);
                System.out.println(userName + " the division of " + inputNumber1 + " : " + inputNumber2 + " = " + result3);
            }
            System.out.println("Do you want to continue?");
            System.out.println("enter 1 for yes");
            System.out.println("enter 2 for no");
            byte yesNo = scanner.nextByte();
            if (yesNo == 2) {
                System.out.println("Ok, goodbye! :)");
                System.exit(0);
            }
        }
    }
}
