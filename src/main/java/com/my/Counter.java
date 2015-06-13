package com.my;

public class Counter extends Parent {

    public static int count2Numbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static boolean checkDiscount(int sum) {
        if (sum > 100) {
            return true;
        } else {
            return false;
        }
    }

}