package com.my;

public class Division implements Interlico {

    long a;

    long b;

    public Division(long a, long b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double count() {

        double c = a/b;

        System.out.println("Division = " + c);
        return c;
    }


}

