package com.company;

import java.util.*;

public class FibbonacciSeries {
    public static int Fibbonacci(int input){
        if(input <= 1){
            return input;
        }
        return Fibbonacci(input-1) + Fibbonacci(input-2);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0 ; i < input; i++){
            System.out.print(Fibbonacci(i)+" ");
        }
    }
}
