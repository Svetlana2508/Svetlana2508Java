package com.java.class12;

// Write a program to print sum of 1 to 10 numbers
// 1+2+3+4+5+6+7+8+9+10

    public class SumOf1to10 {

        public static void main(String[] args) {
            int result=0;

            for (int i = 1; i <= 10; i++) {
                result = result + i;
            }
            System.out.println(result);

        }
}
