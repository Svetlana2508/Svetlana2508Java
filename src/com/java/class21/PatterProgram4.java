package com.java.class21;
//        1
//       121
//      12321
//     1234321
//    123454321

public class PatterProgram4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

// Print space in each row
            for (int s = 1; s <= 5-i ; s++) {
                System.out.print(" ");
            }
 // Print Digits in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

                for (int j=i-1; j >=1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

