package com.java.class08;

import java.util.Scanner;

public class HwPrintLoginStatus {

    public static void main(String[] args) {

        // Input

        System.out.println("Please enter username & password:");
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "Devs", expPassword = "Spring2022";

        //Output
        if (username == expUsername && password == expPassword) {

            System.out.println("Login Successful");
        } else if (username != expUsername && password != expPassword) {
            System.out.println("Login Unsuccessful");
        } else if (username != expUsername && password == expPassword) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Invalid Password");
        }
    }}