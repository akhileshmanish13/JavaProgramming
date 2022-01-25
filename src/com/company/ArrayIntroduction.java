package com.company;

import java.util.*;

public class ArrayIntroduction {
    public static void main(String[] args){
        // Array of Numbers
        //Syntax of declaring array
        // 1. (data type) (arrayName)[] = (new) (datatype) [size]
        // 2. (datatype) (arrayName)[] = {a, b, c.......,n}
        System.out.print("Enter the number of element in Array: ");
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int [] marks = new int[size];
        System.out.println("Enter the elements is array: ");
        for(int i = 0; i< size; i++){
            marks[i] = sc.nextInt();
        }
        System.out.print("marks [] = {");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(+marks[i] + ",");
        }
        System.out.println("}");
    // ============================================================================================================
        // Array of Strings
        String [] name = new String[size];
        System.out.println("Enter the names of Students :");
        for (int i = 0; i < size; i++ ){
            name[i] = sc.next();
        }
        System.out.print("name [] = { ");
        for(int i =0 ; i < name.length; i++){
            System.out.print( name[i] +", " );
        }
        System.out.print("}");
    }
}
