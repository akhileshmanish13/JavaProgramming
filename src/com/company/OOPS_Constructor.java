package com.company;
class Pen{
    String color;
    public void printColor(){
        System.out.println(this.color);
    }
//    Pen(){                                      // 1. Non parameterized Constructor
//        System.out.println(this.color);
//    }
//    Pen(String color){                          // 2. Parameterized Constructor
//        this.color = color;
//    }
    Pen(){

    }
    Pen(Pen p2){
        this.color  = p2.color;                    // 3. Copy Constructor
    }
}
public class OOPS_Constructor {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.color = "Black";
        Pen p2 = new Pen(p1);               // Taking p1 as copy constructor
        p2.printColor();
    }
}
