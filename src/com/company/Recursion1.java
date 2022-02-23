package com.company;

import java.util.*;

public class Recursion1 {
    public static int powerFun(int x, int n){
        if( n==0){
            return 1;
        }
        int x_ = powerFun( x, n-1);
        int ans = x * x_;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerFun(x,n));
    }
}
