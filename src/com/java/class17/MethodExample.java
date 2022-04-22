package com.java.class17;

import java.util.Scanner;

public class MethodExample {
    static void printLine(){
        System.out.println("========================================");
    }
    static void printLineStar(){
        System.out.println("*************************************");
    }
    static void printLine(int length, char c){
        for (int i = 1; i<=length; i++){
            System.out.print(c);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        printLine();

        System.out.println("Please enter first number: ");


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printLineStar();

        System.out.println("Please enter second number: ");
        printLineStar();

        int b = sc.nextInt();
       printLine(30,'=');
        System.out.println("========================================");
        System.out.println("Please enter the operation ( Add/Div/ Sub/ Mul)");
        System.out.println("========================================");
        String operation = sc.next();

        switch (operation){
            case "Add":
                System.out.println(a + b);
                break;
            case "Sub":
                System.out.println(a - b);
                break;
            case "Div":
                System.out.println(a / b);
                break;
            case "Mul":
                System.out.println(a * b);
                break;
            default:
                System.out.println(" Invalid Choice... please try after");
        }


    }
}
