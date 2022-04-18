package com.java.class12;

// Write a program  to find a factorial from user's number

import java.util.Scanner;


public class HomeworkFactorial2 {

    public static void main(String[] args) {
    System.out.println("Please enter the number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int factorial = num;

    for (  int i = num; i >= 1;  --i) {
        factorial = factorial  * i;

    }
    System.out.println(factorial);

}

}



