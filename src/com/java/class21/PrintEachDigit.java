package com.java.class21;
// Write a program to print each digit of number into each line

public class PrintEachDigit {
    public static void main(String[] args) {
        int num = 25343;
        // Output
        // 2
        // 5
        // 3
        // 4
        // 3
        while (num > 0) {

            // Retrieve last digit from number

            System.out.println(num % 10);
            num = num / 10;


        }
    }
}