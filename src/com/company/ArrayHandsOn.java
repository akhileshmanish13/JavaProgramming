package com.company;

import java.util.*;

public class ArrayHandsOn {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("Enter the Numbers in array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
/*  1. Find Largest and Smallest Numnber in array.
//====================================================================================================
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i =0 ; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Largest number in Number[] is : "+ max);
        System.out.println("Smallest number in Number[] is : "+ min);
 */
//=================================================================================================================
//2.  Find a Number in array(Linear Search)
        System.out.print("Enter The number to be searched: ");
        int x = sc.nextInt();
        for (int i = 0; i< number.length;i++ ){
            if(number[i] == x) {
                System.out.println(x + " is at index " + i);
            }
        }
    }
}
