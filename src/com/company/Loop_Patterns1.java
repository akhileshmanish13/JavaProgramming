package com.company;

import java.util.*;


public class Loop_Patterns1 {
    public static void main(String[] args){
        // Print all even numbers till n

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
/*
        for (int i = 0; i <= number; i++){
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
  */
 // Homework Question 2
//        do {
//            int marks = input.nextInt();
//            if (marks >= 90 && marks <=100) {
//                System.out.println("This is Good");
//            }
//            else if (marks <= 89 && marks >= 60) {
//                System.out.println("This is also Good");
//            }
//            else if (marks >= 0 && marks <= 59){
//                System.out.println("This is Good as well");
//            }
//            else{
//                System.out.println("Enter marks out of 100");
//            }
//
//            System.out.println("Want to continue? \n YES (1) and NO (0) ");
//            number = input.nextInt();
//
//        }while(number == 1);

        // Homework Questions 3 Checking Prime Number
        boolean isPrime= true;
        for(int i=2; i <= number/2; i++ ){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            if (number == 1) {
                System.out.println("1 is neither prime nor composite number");
            } else {
                System.out.println("Input number is Prime number");
            }
        }
        else{
            System.out.println("Input number is not a Prime number");
            }
    }
}
