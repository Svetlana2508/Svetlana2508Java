package com.java.class15;

// 1.Take two words from the user and concatenate two words together
// however if the concatenation creates a double char, then omit one of the characters. Save the result of
// concatenation and print it out.
// ex1. "abc"  "cat"  --> "abcat"
// ex2. "abc"  "xyz" --> "abcxyz"
import java.util.Scanner;

public class GoldenClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two words");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String combined = "";
        if (str.charAt(str.length()-1) == (str2.charAt(0))) {
            combined = str + str2.substring(1);
        } else{
            combined = str + str2;

        }
        System.out.println(combined);
    }
}
