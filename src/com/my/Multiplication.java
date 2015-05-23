package com.my;

public class Multiplication implements Interlico {


    @Override
    public double count(long a, long b) {

      double c = a*b;

        System.out.println("Multiplication = " + c);
        return c;

    }
}

