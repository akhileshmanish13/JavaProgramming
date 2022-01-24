package com.company;

import java.util.*;

public class Number_Table {
    public static void main(String[] args) {
        // Using print line method----------------------------------------------------
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number + " * 1 = " + (number*1));
        System.out.println(number + " * 2 = " + (number*2));
        System.out.println(number + " * 3 = " + (number*3));
        System.out.println(number + " * 4 = " + (number*4));
        System.out.println(number + " * 5 = " + (number*5));
        System.out.println(number + " * 6 = " + (number*6));
        System.out.println(number + " * 7 = " + (number*7));
        System.out.println(number + " * 8 = " + (number*8));
        System.out.println(number + " * 9 = " + (number*9));
        System.out.println(number + " * 10 = " + (number*10));

        //Using For loop---------------------------------------------------------------------
        for(int i=1; i<=10; i++){
            int target = number * i;
            System.out.println(number + " * " + i + " = " + target);
        }
    }
}
