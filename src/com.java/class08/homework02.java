package com.java.class08;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inches = sc.nextInt();

        if (inches >= 27 && inches <= 30){
            System.out.println("Size is XS");
        }else if (inches >= 31 && inches <= 34){
            System.out.println("Size is S");
        }else if (inches >= 35 && inches <= 38){
            System.out.println("Size is M");
        }else if (inches >= 39 && inches <= 42){
            System.out.println("Size is L");
        }else if (inches >= 43 && inches <= 45){
            System.out.println("Size is XL");
        }

    }
}
