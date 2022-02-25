package com.company.Recursion;
public class Recursion2 {
//    1. Find the occurrence of the first and last occurrence index of an element using recursion
    public static int first = -1;
    public static int last = -1 ;
    public static void findOccurence(String str, int index, char element){
        if(index == str.length()){
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findOccurence(str, index+1, element);
    }
    public static void main(String[] args){
        String str = "ajrahka";
        char element = 'a';
        findOccurence(str,0 , element);
        System.out.println("First Occurrence: "+ first);
        System.out.println("Last Occurrence: "+ last);

    }
}
