package com.java.class15;

import java.util.Scanner;

/**
 * Take two words from the user, concatenate  words that have three characters one by one and print them
 * if any of the words has more than three characters print Error message "Incorrect input! Cannot merge".
 *
 * ex
 * "ice", "sea"
 *
 *
 * output:
 * isceae
 *
 * ex2:
 * "Hot", "Day"
 *
 * output:
 * HDoaty
 *
 * ex3:
 * "Hello", "Day"
 * output:
 * Incorrect input! Cannot merge
 */


public class ThursdayClass3 {
    public static void main(String[] args) {
        System.out.println("Input two words");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
    }
}
