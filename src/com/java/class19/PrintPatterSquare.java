package com.java.class19;

public class PrintPatterSquare {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {


            // Print
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 0){
                    System.out.print("&");
                }else{
                    System.out.print("*");
                }



            }
            // Print Enter
            System.out.println();
        }
    }


}
