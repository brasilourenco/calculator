package com.lourenco;

public class Main {
    public static void main(String[] args) {
        Calculator counts = new Calculator();
        int addResult = counts.add(4, 3);
        int subsResult = counts.substract(3, 3);
        int mulResult = counts.multiply(3, 4);
        int divResult = counts.divide(10, 2);

        Calculator counts2 = new Calculator();
        double addResult1 = counts2.add1(1.5, 1.5);
        double subsResult1 = counts2.sub1(4.5, 1.5);
        double mulResult1 = counts2.mul1(4.5, 2);
        double divResult1 = counts2.div1(10, 3);
        int divResult2 = counts2.div2(0, 5);

        System.out.println(addResult + "\n" + subsResult + "\n" + mulResult + "\n" + divResult + "\n");
        System.out.println(addResult1 + "\n" + subsResult1 + "\n" + mulResult1 + "\n" + divResult1 + "\n" + divResult2 + "\n");

    }
}

