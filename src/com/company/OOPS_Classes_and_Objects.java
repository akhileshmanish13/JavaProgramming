package com.company;
/*
Class --> is a user-defined data type which defines its properties and its functions.
Class is the only logical representation of the data.
For example, Human being is a class. The body parts of a human being are its properties,
and the actions performed by the body parts are known as functions. The class does not occupy
 any memory space till the time an object is instantiated.

Object --> is a run-time entity. It is an instance of the class.
An object can represent a person, place or any other item.
 An object can operate on both data members and member functions.
 */

class Student{                              // Class Student
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPS_Classes_and_Objects {
    public static void main(String[] args){
        Student S1 = new Student();                 // Object 1 (S1) initiated
        S1.name = "Akhilesh";
        S1.age = 24;
        S1.printInfo();
        Student S2 = new Student();                //  Object 2 (S2) initiated
        S2.name = "Nisha";
        S2.age = 21;
        S2.printInfo();
    }

}
