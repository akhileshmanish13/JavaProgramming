package com.company;

import java.util.*;

public class Functions_and_Methods {
    // FACTORIAL FUNCTION
    public static void Factorial(int number){
        if(number < 0 ){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i = number; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    //===========================================================================================================
    // Prime Number Function
    public static boolean isPrime(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++){
            if((number%i) == 0){
                prime = false;
                break;
            }
        }
        if (number <= 1) {
            System.out.println(number + " is neither prime not composite");
        }
        else if(prime = true){
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
        return prime;
    }

    public static void main(String[] args){
        System.out.print("Enter the Number whose factorial you need : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Factorial(number);
        isPrime(number);
    }
}
