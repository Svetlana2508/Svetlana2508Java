package com.java.class13;

public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Devx";
        int a = 10;
        int b = 20;
        int c = 5;

        System.out.println("Add" + a + b);           // Add
        System.out.println("Add" + a + b + c);
        System.out.println("Add" + a + b * c);
        System.out.println( a + b +"Add");

        System.out.println( a + b +"Add" + a + b) ;  // 30Add1020
        System.out.println( a +"Add" +(b - c));
        System.out.println( str1 +a + b +str2);
        System.out.println( "Add" + "10" + "20" +"str1");
        System.out.println( a + b - c);
    }
}
