package com.my;

import java.util.StringTokenizer;

public class StringExample {

    public static void main(String[] args) {
//        System.out.println(test);
        // "abc " + 'd' = "abc d"
        // "abc " + 6 = "abc 6"
        // "abc " + null = "abc null"
        // "abc " + new Person() = "abc Person@49456983465"
        // "abc " + false = "abc false"

//        System.out.println(test.substring(0,5));
//        String withDelimiter = "adf bgh ,;cer drt,ety";
//        System.out.println(withDelimiter.contains("adf"));
//        System.out.println(withDelimiter.toUpperCase());
//        "SanDiego".toLowerCase().equals("sandiego");
        StringBuilder builder = new StringBuilder();
        builder.append("test").append("hello").append(56);
        System.out.println(builder);
                //sandiego
    }
}
