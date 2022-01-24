package com.company;

import java.util.*;

public class Coditional_Statements {
    public static void main(String[] args) {

        /*  Calculator using  Switch Homework  */
         Scanner input =  new Scanner(System.in);
        /*int a = input.nextInt();
        int b = input.nextInt();

        String n  =  input.next();
        switch (n){
            case ("+") :
                int add = a + b;
                System.out.println(add);
                break;
            case ("-"):
                int sub = a - b;
                System.out.println(sub);
                break;
            case ("*"):
                int mul = a * b;
                System.out.println(mul);
                break;
            case ("/"):
                float div = a/b;
                System.out.println(div);
                break;
            case ("%"):
                int remainder =  a%b ;
                System.out.println(remainder);
                break;
            default:
                System.out.println("Enter valid operataion buttons");
        }*/

        System.out.println("============================================================================================");
        // Name of month usnig switch case
        int number = input.nextInt();
        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feburary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter valid month number");
        }
        System.out.println("============================================================================================");
    }
}
