package lesson16;

public class ClassWork02 {
    public static void main(String[] args) {
     //   System.out.println(startWord("hippo", "hi")); // → "hi"
     //   System.out.println(startWord("hippo", "xip")); // → "hip"
      //  System.out.println(startWord("hippo", "i")); // → "h"


        //System.out.println(makeAbba("Hi", "Bye")); // → "HiByeByeHi"
        //System.out.println(makeAbba("Yo", "Alice")); // → "YoAliceAliceYo"
        //System.out.println(makeAbba("What", "Up")); // → "WhatUpUpWhat

        // System.out.println(extraEnd("Hello")); // → "lololo"
        // System.out.println(extraEnd("ab")); //"ababab"
        //  System.out.println(extraEnd("Hi")); //"HiHiHi"

      //  System.out.println(withoutEnd("Hello")); // → "ell"
       // System.out.println(withoutEnd("java")); // → "av"
       // System.out.println(withoutEnd("coding")); // → "odin
        System.out.println(left2("Hello")); // → "lloHe"
        System.out.println(left2("java")); // → "vaja"
        System.out.println(left2("Hi")); //→ "Hi"


    }

    public static String startWord(String s, String word) {
        int is = s.length();
        return s.substring(0, word.length());
    }


    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String extraEnd(String s) {
        s = s.substring(s.length() - 2);
        return s + s + s;

    }

    public static String withoutEnd(String s) {

        return s.substring(1, s.length() - 1);
    }

    public static String left2 (String s) {
        return s.substring(2) +s.substring(0,2);
    }
}
