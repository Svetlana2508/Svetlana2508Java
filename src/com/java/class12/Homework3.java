package com.java.class12;

// Please write a program not division by 3 and division by 7

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        System.out.println("Please enter the limit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;

        while (i<=num) {

            if (i%3!=0 && i%7==0){
                System.out.println(i);

            }
         i++;
        }


    }
}
