package com.company;

import java.util.*;

public class InsertionSort {
    public static void printArray(int [] numbers){
        System.out.print("Array Sorted in ascending order: ");
        for(int k = 0 ; k < numbers.length; k++ ){
            System.out.print( numbers[k]+" ");
        }
        System.out.println();

    }
//    Insertion sort TIME COMPLEXITY -->  O (n^2)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];                         // Declaring array

        System.out.println("Enter the numbers in array: ");      // Taking input from User
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 1 ; i < numbers.length ; i++){
            int current = numbers[i];
            int  j = i - 1;
            while (j >= 0 && numbers[j] > current){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = current;
        }
        printArray(numbers);
    }
}
