package com.company;

import org.w3c.dom.ls.LSOutput;

class Shape{
    String color;
}
// Single level Inheritance
class Tringle extends Shape{                            // extends keyword for Inheritance
    public void area(int length,int height){
        System.out.println(this.color);
        System.out.println(0.5 * (length * height));
    }
}
// Multi level Inheritance
class Circle extends Shape{
    public void area(int rad){
        System.out.println(this.color);
        System.out.println(3.14 * rad * rad);
    }
}
public class OOPS_Inheritance {
    public static void main (String[] args){
        Tringle t1 = new Tringle();                         // first object from Triangle derived class
        t1.color = "Red";                                  // attribute from parent/base class
        t1.area(10,5);
        Circle c1 = new Circle();                           // first object from circle derived class
        c1.color = "Blue";
        c1.area(5);
    }
}
