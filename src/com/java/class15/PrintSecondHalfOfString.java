package com.java.class15;
//Write a program to print 2nd half of String


import java.util.Scanner;

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(str.substring(str.length() / 2));
        System.out.println(str.substring(str.length() / 2 + 1));

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(str.length() / 2));
        } else {
            System.out.println(str.substring(str.length() / 2 + 1));

        }
    }
}