package com.my;

public class MainResult extends Parent {

    public static String str = "hello";

    public final String nonStatic = "world";


    public void print() {
        System.out.println(str + "принт даже ява");
        System.out.println("4444");
    }

    public MainResult() {

    }
    public MainResult(String str) {

    }

    public static void main(String[] args) {

        MainResult mr = new MainResult("");
        System.out.println(StringUtils.stringLength("a"));
        System.out.println(StringUtils.stringLength("aa"));

    }

}