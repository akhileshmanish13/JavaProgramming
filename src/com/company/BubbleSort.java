package com.company;

import java.util.*;

public class BubbleSort {

    public static void printArray(int [] numbers){
        System.out.print("Array Sorted in ascending order: ");
        for(int k = 0 ; k < numbers.length; k++ ){
            System.out.print( numbers[k]+" ");
        }
        System.out.println();

    }
//    Bubble sort TIME COMPLEXITY --->  O (n^2)

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int [] numbers = new int[size];                         // Declaring array

        System.out.println("Enter the numbers in array: ");      // Taking input from User
        for(int i = 0; i< numbers.length ; i++ ){
            numbers[i] = sc.nextInt();
        }
        int temp;
        for(int  i = 0; i < numbers.length - 1; i++){               // Bubble sort
            for(int j = 0 ; j < numbers.length - i - 1; j++){
                if(numbers[j] > numbers[j+1] ){
                    temp = numbers[j];                               // Swaping
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        printArray(numbers);
    }
}
