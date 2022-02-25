package com.company.OOPS;

/*
Polymorphism is the ability to present the same interface for differing underlying forms (data types).
With polymorphism, each of these classes will have different underlying data.
Precisely, Poly means ‘many’ and morphism means ‘forms’.

Types of Polymorphism
1. Compile Time Polymorphism (Static)(Method Overloading)
2. Runtime Polymorphism (Dynamic)(Method Over ridding)
 */

class Children{
    String name;
    int age;
    public void printInfo(String name){                 // Method 1
        System.out.println(name);
    }
    public void printInfo(int age){                     // Method 2
        System.out.println(age);
    }
    public void printInfo(String name, int age){        // Method 3
        System.out.println(name+" "+ age);
    }
}
public class OOPS_Polymorphism {
    public static void main(String[] args){
        Children c1 = new Children();
        c1.name = "Akhilesh";
        c1.age = 24;
        c1.printInfo(c1.age);
        c1.printInfo(c1.name);
        c1.printInfo(c1.name, c1.age);

    }
}
