package com.company.Recursion;

import java.util.*;

public class Recursion1 {
//    1. Power Fuction to calculate the exponential value
    public static int powerFun(int x, int n){
        if( n==0){
            return 1;
        }
        int x_ = powerFun( x, n-1);
        int ans = x * x_;
        return ans;
    }
//    2. Reverse a string
    public static void revStr(String str, int index){
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        revStr(str,index-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(powerFun(x,n));
        revStr(str,str.length()-1);
    }
}
