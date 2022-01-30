package com.company;

import java.util.*;

public class Strings {
    public static void main(String[] args){
//        1. String Declaration
        String firstName = "Akhilesh";
        String lastName = "Rawat";


//        2. Concatination
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

//        3. Input String from User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
//        String name = sc.next();                // Scan first string without space
        String Name = sc.nextLine();            // Scan whole String
        System.out.println(Name);

//        4. Finding Length of The String
        System.out.println(Name.length());

//        5. charAt fuction in java
        for(int i = 0; i < Name.length(); i++){
            System.out.print(Name.charAt(i)+ "  ");
        }
        System.out.println();

//        6. compareto funtion in java
        if(firstName.compareTo(lastName) == 0){
            System.out.println("firstNmae is equal to lastName");
        }else if (firstName.compareTo(lastName) < 0){
            System.out.println("firstName is greater than lastName");
        }else{
            System.out.println("lastName is greater than firatName ");
        }

//        7. substring function in java
        String sentence = "My name is Akhilesh Rawat";
        System.out.println(sentence);
        System.out.println(sentence.substring(0,11));

//        8. parseInt method in java
        String str1 = "123456789";
        int num = Integer.parseInt(str1);
        System.out.println(num);

//        9. toString method in java
        int number = 7409134;
        String numb = Integer.toString(number);
        System.out.println(numb.length());
        System.out.println(numb.substring(0,4));

    }
}
