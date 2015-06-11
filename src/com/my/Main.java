package com.my;

public class Main {

    public static void main(String[] args) {
        int totalSum = Counter.count2Numbers(100, 12);
        boolean isDiscount = Counter.checkDiscount(totalSum);
        System.out.println(isDiscount);
    }


}
