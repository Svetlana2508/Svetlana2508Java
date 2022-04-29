package com.java.class20;
//        9
 //       98
//        987
//        9876
//        98765


public class PatterProgram2 {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--) {
            int k = 9;
            for (int j = 5; j >= i; j--) {
                System.out.print(k);
                k--;
            }
            System.out.println();

        }

 //       98765
 //       9876
 //       987
 //       98
 //       9

        for (int i = 5; i >=1; i--) {
            int k = 9;
            for (int j = 1; j<= i; j++) {
                System.out.print(k);
                k--;
            }
            System.out.println();

        }

    }

}
