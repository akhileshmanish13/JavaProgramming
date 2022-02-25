package com.company.Recursion;

public class Recursion3 {
//    Check whether the array is sorted in increasing order or not.
    public static boolean isSorted(int arr[], int index){
        if (index == arr.length-1){
            return true;
        }
        if(!isSorted(arr,index+1)){
            return false;
        }
        return (arr[index] < arr[index+1]);
    }
    public  static void main (String[] args){
        int arr1[] = {1, 5 , 6,  3 };
        int arr2[] = {1, 3, 3, 4, 5};
        int arr3[] = {1, 2 ,3 ,4 ,5};
        if(isSorted(arr3,0)){
            System.out.println("Sorted order");
        }
        else{
            System.out.println("Not in sorted order");
        }
    }
}
