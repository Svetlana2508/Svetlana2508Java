package com.javaProject;
/*
 * Write a java program to find out if the given year is leap or not
 *  sample output:
 * enter any calendar year : 2000
 * 2000 is a leap year
 */

import java.util.Scanner;

public class Project5LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Project5LeapYear leapYear = new Project5LeapYear();
        System.out.println(" Enter year :");
        int year = scanner.nextInt();
        if (leapYear.leapOrNot(year)) {
            System.out.println(year + "   --- leap year");

        } else {
            System.out.println(year + "   ---  not leap year");
        }
    }
        public boolean leapOrNot(int year){
            return(( year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0));
        }
    }
