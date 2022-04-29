package com.javaProject;
/*
 * Write a java program to calculate discount for a product
 *
 *  sample output:
 * marked price:
 * 100
 * discount rate:
 * 25
 * amount after discount: 75.0
 */
import java.util.Scanner;

public class Project5Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Project5Discount discountObj = new Project5Discount();

        System.out.println("Enter market price");
        double markedPrice = scanner.nextDouble();
        System.out.println("Enter discount rate");
        double  discount = scanner.nextDouble();
        double amount = 0;
        discountObj.printMessage(calculateDiscount(markedPrice,discount));
    }
    public static double calculateDiscount(double markedPrice, double discount) {
        return markedPrice - (markedPrice/ 100 * discount );
    }
    public void printMessage(double message) {
        System.out.println("Amount    "   +    message);
    }
}
