package com.my;

public class ResultFromAll implements Interlico {

    @Override
    public void count() {

        int n = 6;
        int[] mas = new int[n];

        mas[0] = 6;
        mas[1] = 3;
        mas[2] = 5;
        mas[3] = 2;
        mas[4] = 200;
        mas[5] = 400;

        long i = mas[0]+ mas[1] ;
        long f = mas[2] / mas[3];
        long l = mas[4] * mas[5];

         long l1 = i + f + l;

        //System.out.println("Sum of mas[0]+mas[1] = " + i);
        //System.out.println("Div of mas[2]/mas[3] = " +f);
        //System.out.println("Mul of mas[4]*mas[5] = " +l);
        System.out.println("Sum of all = " + l1);
    }



        //int[] m = {6, 3, 5, 2, 2000000, 4000000};


        //for (int x =0; x < 6; x++ ){
        // m[x] = x + m.length;

        /*
        int a = 6;
        int b = 3;
        int res = a + b;
        */

    }




