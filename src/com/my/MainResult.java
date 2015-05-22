package com.my;

public class MainResult {

    public static void main(String[] args) {

        Interface intr = new Addition();
        intr.count();

        System.out.println();

        intr = new Division();
        intr.count();

        System.out.println();


        intr = new Multiplication();
        intr.count();

        System.out.println();

    }

}