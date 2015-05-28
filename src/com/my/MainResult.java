package com.my;

public class MainResult extends Parent {

    public MainResult(String str) {
//        super();
        System.out.println(str);

    }

    public double printCount  (Interlico inter) {
        return inter.count();
    }

    public static void main(String[] args) {

        MainResult result = new MainResult("");
        MainResult result2 = new MainResult("sdfsdf");

        double d;

        Addition intr = new Addition (5, 10); // ��������
        d = result.printCount(intr);

        Division division = new Division(10, 2);
        d = d+result.printCount(division);

        Multiplication multiplication = new Multiplication(2, 5);
        d = d + result.printCount(multiplication);

        System.out.println(d);
    }

}