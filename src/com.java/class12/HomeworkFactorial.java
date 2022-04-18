package com.java.class12;

// Write a program  to find a factorial from user's number

import java.util.Scanner;

public class HomeworkFactorial {

    public static void main(String[] args) {
    System.out.println("Please enter the number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        int factorial = 1;
        int factorial1 = 1;

        for (  int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);


        for (  int i = num; i >= 1; i--) {
            factorial1 = factorial1 * i;
        }
        System.out.println("Reverse " + factorial1);
    }


}
