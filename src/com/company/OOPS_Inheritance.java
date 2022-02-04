package com.company;

import org.w3c.dom.ls.LSOutput;

class Shape{
    String color;
}
// Single level Inheritance --- > one class derived from base class
class Tringle extends Shape{                            // extends keyword for Inheritance
    public void area(int length,int height){
        System.out.println(this.color);
        System.out.println(0.5 * (length * height));
    }
}
// Multi level Inheritance ----> deriving class from another derived class
class EquilateralTriangle extends Tringle{
    int side;

}
// Hierarchical Inheritance ---- > more than one class derived from base class.
class Circle extends Shape{
    public void area(int rad){
        System.out.println(this.color);
        System.out.println(3.14 * rad * rad);
    }
}

// Hybrid Inheritance  --->  Combination of Single , Multi , Hierarchical Inheritance

public class OOPS_Inheritance {
    public static void main (String[] args){
        Tringle t1 = new Tringle();                         // first object from Triangle derived class
        t1.color = "Red";                                  // attribute from parent/base class
        t1.area(10,5);

        EquilateralTriangle e1 = new EquilateralTriangle();     // first object from derived Equilateral Derived class
        e1.color = "Green";
        e1.side = 5;
        e1.area(5,5);

        Circle c1 = new Circle();                           // first object from circle derived class
        c1.color = "Blue";
        c1.area(5);
    }
}
