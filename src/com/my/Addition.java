package com.my;

public class Addition implements Interlico {


    @Override
    public double count(long a, long b) {

        double c = a+b;
        System.out.println("Addition = " + a+b);
        return c;
    }

}



