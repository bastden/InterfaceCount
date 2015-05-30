package com.my;

public class MainResult {

        public double printCount  (Interlico inter, long a, long b) {
            return inter.count(a, b);
        }

    public static void main(String[] args) {

        MainResult result = new MainResult();

        double d;

        Addition intr = new Addition (); // значение
        d = result.printCount(intr, 5, 10);

        Division division = new Division();
        d = d+result.printCount(division, 10, 2);

        Multiplication multiplication = new Multiplication();
        d = d + result.printCount(multiplication, 2, 5);

        System.out.println(d);
    }

}