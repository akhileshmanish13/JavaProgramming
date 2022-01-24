package com.company;

import java.util.*;

public class CircumferencOfCircle {
    public static float Cicumference(int radius){
        float circumferenceCircle = (2 * radius * 3.14f);
        return circumferenceCircle;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        int radius = sc.nextInt();
        System.out.println("Circumference of circle with" + radius +" is " + Cicumference(radius));
    }
}
