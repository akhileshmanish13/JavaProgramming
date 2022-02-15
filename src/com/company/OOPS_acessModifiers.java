package com.company;
import java.util.*;

class Vehicle{
    public String Type = "4-Wheeler";                   // 'public' keyword can be by access all the classes
    public void work(){
        System.out.println("Means of Transport");
    }
}
class Cars extends Vehicle{
    protected String Brand = "Hyudai";              // 'protected' keyword can accessed by only subclasses
    private int engineNo ;                          // 'private' keyword cannot be accessed by outside the class
    public void setEngineNo(int engineNo){
        this.engineNo = engineNo;
        System.out.println(engineNo);
    }
    protected void horn(){
        System.out.println("Poooooonnnn");
    }
}
final class Segment extends Cars{                   // 'final' keyword used so that Segment class cannot be inherited
    protected String model = "Venue";
    public String color = "Blue";
}


public class OOPS_acessModifiers {
    public static void main(String[]args){
        Segment SUV1 = new Segment();
        System.out.println(SUV1.Type);
        SUV1.work();
        System.out.println(SUV1.Brand);
        System.out.println(SUV1.model);
        System.out.println(SUV1.color);
        Cars car1 = new Cars();
        System.out.println(car1.Brand);
        car1.horn();
        car1.setEngineNo(485128745);

    }
}
