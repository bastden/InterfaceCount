package com.my;

public class Addition implements Interlico {

    long a;

    long b;

    public Addition(long a, long b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public double count() {

        double c = a+b;
        System.out.println("Addition = " + c);
        return c;
    }

}



