package com.company;

import java.util.*;

public class Variables {
    public static void main(String[] args) {
        // String type Input
        Scanner sc = new Scanner(System.in);
        //String name = sc.next(); // For the first word without space
        String full_name = sc.nextLine(); // For the whole sentence
        //System.out.println(name);
        System.out.println(full_name);

        // For int data type ---> nextInt();
        // For double data type ---> nextDouble();
        // For float data type ---> nextFloat();

        long c = 5186587398085l;
        System.out.println(c);

        double d = 3857835d;
        System.out.println(d);

        float f = 54.098504f;
        System.out.println(f);

    }
}
