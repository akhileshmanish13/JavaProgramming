package com.company;

import java.util.*;

public class SelectionSort {

    public static void printArray(int [] numbers){
        System.out.print("Array Sorted in ascending order: ");
        for(int k = 0 ; k < numbers.length; k++ ){
            System.out.print( numbers[k]+" ");
        }
        System.out.println();

    }
//    Merge sort TIME COMPLEXITY -->  O (n^2)

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int [] numbers = new int[size];                         // Declaring array

            System.out.println("Enter the numbers in array: ");      // Taking input from User
            for(int i = 0; i< numbers.length ; i++ ){
                numbers[i] = sc.nextInt();
            }

            for(int i = 0; i < numbers.length - 1; i++){
                int smallest = i;
                for (int j = i + 1 ; j < numbers.length; j++){
                    if(numbers[smallest] > numbers[j]){
                        smallest = j;
                    }
                }
                int temp = numbers[smallest];                           // Swapping
                numbers[smallest] = numbers[i];
                numbers[i] = temp;
            }
            printArray(numbers);
    }
}
