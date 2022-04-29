package com.java.class20;
// 54321
// 5432
// 543
// 54
// 5

// 5
// 54
// 543
// 5432
// 54321



public class PatternProgram1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print(6-j);
            }
            System.out.println();

        }

        for (int i = 5; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}