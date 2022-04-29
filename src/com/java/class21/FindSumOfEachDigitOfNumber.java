package com.java.class21;

// 235
// output  10       / 2+3+5 /


public class FindSumOfEachDigitOfNumber {
    public static void main(String[] args) {
        int num = 235;
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;

            num = num / 10;

        }
        System.out.println(sum);
    }
}