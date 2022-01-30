package com.company;

import java.util.*;

/*
We use StringBuilder to decrease run time for code.
We don't have to declare new String
*/
public class stringBuilder {
    public  static void main(String[] args){
//        1. Declaration of StringBuilder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

//        2. setCharAt function in String Builder
        sb.setCharAt(0 ,'J');
        System.out.println(sb);

//        3. Insert function
        sb.insert(1, 'h');
        System.out.println(sb);

//        4. Append Function
        sb.append( " Walker");
        System.out.println(sb);

//        5. Delete function
        sb.delete(5,12);
        System.out.println(sb);

//        6. deleteCharAt function
        sb.deleteCharAt(1);
        System.out.println(sb);

//        7. Reverse String with help of String
        StringBuilder str = new StringBuilder("Akhilesh Rawat");
        for(int i =0 ; i < str.length()/2; i++){
            int first = i;
            int last = str.length() - i - 1 ;

            char front = str.charAt(first);
            char end = str.charAt(last);

            str.setCharAt(first,end);
            str.setCharAt(last, front);
        }
        System.out.println("Reverese Order of String is "+ str );


    }
}
