package com.my;

public class Division implements Interlico {


    @Override
    public double count(long a, long b) {

        double c = a/b;

        System.out.println("Division = " + c);
        return c;
    }


}

