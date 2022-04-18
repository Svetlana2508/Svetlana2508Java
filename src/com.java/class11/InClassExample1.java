package com.java.class11;

// 1 2 * 4 5 * 7 8 * 10

import java.util.Scanner;

public class InClassExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int i = 1;

        while (i <= limit) {
            System.out.println(i );
            System.out.println(i +1);
            i++;
            System.out.println("*");
            i= i+2;
        }
    }
}