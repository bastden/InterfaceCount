package com.my;

public class Multiplication implements Interlico {

    long a;
    long b;

    public Multiplication(long a, long b) {
        this.a = a;
        this.b = b;

    }
    @Override
    public double count() {

      double c = a*b;

        System.out.println("Multiplication = " + c);
        return c;

    }
}

