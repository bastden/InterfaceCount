package com.my;

public class Addition implements Interface {


    @Override
    public void count() {
        int a = 6;
        int b = 3;
        int res = a + b;

        System.out.println("Addition = " + res);

    }

}

