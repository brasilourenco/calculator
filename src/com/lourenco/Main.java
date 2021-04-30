package com.lourenco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name");


        String userName = scanner.nextLine();  // Read user input
        System.out.println(userName + " enter your 1st number: ");
        double inputNumber1 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber2 = scanner.nextDouble();


        /*Calculator counts = new Calculator();
        int addResult = counts.add(4, 3);
        int subsResult = counts.substract(3, 3);
        int mulResult = counts.multiply(3, 4);
        int divResult = counts.divide(10, 2);*/

        /*Calculator counts = new Calculator();
        double addResult = counts.add(inputNumber1, inputNumber2);

        System.out.println(userName + " the sum of " + inputNumber1 + " + " + inputNumber2 + " = " + addResult + "\n");


        System.out.println(userName + " enter your 1st number: ");
        double inputNumber3 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber4 = scanner.nextDouble();

        double subsResult = counts.sub(inputNumber3, inputNumber4);

        System.out.println(userName + " the subtraction of " + inputNumber3 + " - " + inputNumber4 + " = " + subsResult + "\n");

        System.out.println(userName + " enter your 1st number: ");
        double inputNumber5 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber6 = scanner.nextDouble();

        double mulResult = counts.mul(inputNumber5, inputNumber6);

        System.out.println(userName + " the multiplication of " + inputNumber5 + " * " + inputNumber6 + " = " + mulResult + "\n");


        System.out.println(userName + " enter your 1st number: ");
        double inputNumber7 = scanner.nextDouble();
        System.out.println("now enter your 2nd number: ");
        double inputNumber8 = scanner.nextDouble();

        double divResult = counts.div(inputNumber7, inputNumber8);*/

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name");


        String userName = scanner.nextLine();  // Read user input
        System.out.println(userName + " enter your number: ");
        double inputNumber1 = scanner.nextDouble();

        Calculator counts = new Calculator();
        double dblResult = counts.dbl(inputNumber1);

        System.out.println(userName + " the double of " + inputNumber1 + " is " + dblResult + "\n");


        System.out.println(userName + " enter your number: ");
        double inputNumber2 = scanner.nextDouble();

        double triResult = counts.tri(inputNumber2);

        System.out.println(userName + " the triple of " + inputNumber2 + " is " + triResult + "\n");

        System.out.println(userName + " enter your number: ");
        double inputNumber3 = scanner.nextDouble();

        double halfResult = counts.half(inputNumber3);

        System.out.println(userName + " the half of " + inputNumber3 + " is " + halfResult + "\n");


        System.out.println(userName + " enter your number: ");
        double inputNumber4 = scanner.nextDouble();

        double quarterResult = counts.quarter(inputNumber4);

        System.out.println(userName + " the quarter of " + inputNumber4 + " is " + quarterResult + "\n");
    }
}

