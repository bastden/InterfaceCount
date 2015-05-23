package com.my;

public class Addition implements Interlico {


    @Override
    public void count() {

        int a = 6;
        int b = 3;
        int res = a + b;
       /*
        int[] m = {6, 3, 5, 2, 2000000, 4000000};

        for (int i =0; i < m.length; i++ ){
            m[i] = i + i;

        */
        System.out.println("Addition = " + res);
    }

}



