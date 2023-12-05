package com.bridgelabz;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("welcome to calculator");
        addition();
        substraction();
        multiplication();
        division();

    }
    public static void addition()
    {
        int a=10,b=20;
        System.out.println("Addition is "+(a+b));
    }
    public static void substraction()
    {
        int a=10,b=20;
        System.out.println("Substraction is "+(b-a));
    }
    public static void multiplication()
    {
        int a=10,b=20;
        System.out.println("Multiplication is "+(b*a));
    }
    public static void division()
    {
        int a=10,b=20;
        System.out.println("Division is "+(b/a));
    }
}
