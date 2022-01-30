package com.company;

import java.util.*;

public class StringHandsOn {
    public static void main(String[] args ){
//        1. Input array of string and calculate the combined length of string elements in array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of String Array: ");
        int size = sc.nextInt();
        String [] city = new String[size];
        int cityLen = 0;
        System.out.println("Enter the name of cities: ");
        for (int i = 0; i < size; i++ ){
            city[i] = sc.next();
            cityLen += city[i].length();
        }
        System.out.println("Combined length of city array is: "+ cityLen);
//        =============================================================================================================

//        2. Replacing Char 'e' with char 'i' in strings
        System.out.print("Enter the word: " );
        String word = sc.next();
        String result = "";
        for (int i= 0 ; i < word.length(); i++){
            if(word.charAt(i) == 'e'){
                result += 'i';
            }
            else {
                result += word.charAt(i);
            }
        }
        System.out.println("After replacing 'e' with 'i' in "+ word + " we got "+result);

//        =============================================================================================================
//        3. Input email Id from user and print the part before '@' in Email.
        System.out.print("Enter the email ID of User: ");
        String email = sc.next();
        String userName = "";
        for (int i = 0; i < email.length(); i++ ){
            if (email.charAt(i) == '@'){
                break;
            }
            else{
                userName += email.charAt(i);
            }
        }
        System.out.println("User Name of user is "+ userName);
    }
}
