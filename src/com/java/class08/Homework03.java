package com.java.class08;
// Take a number from user and check if it's divisible by 3 or 5
import java.util.Scanner;


public class Homework03 {
    public static void main(String[] args) {
        System.out.println(" enter a number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 5 == 0 ) {
            System.out.println(" Number is divisible");
        }else{
            System.out.println(" Number is not divisible");
        }

    }
}
