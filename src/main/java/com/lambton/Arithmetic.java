package com.lambton;

public class Arithmetic {
    public int addition(int a, int b){
        System.out.println("Sum of integers: "+(a+b));
        return a+b;
    }

    public float addition(float a, float b){
        System.out.println("Sum of floats: "+(a+b));
        return a+b;
    }

    public String addition(String a, String b){
        System.out.println("Sum of Strings: "+(a+" "+b));
        return a+b;
    }

    public String addition(String a, int b){
        System.out.println("Sum of String and integer: "+(a+" "+b));
        return a+b;
    }

    public String addition(int a, String b){
        System.out.println("Sum of integer and String: "+(a+" "+b));
        return a+b;
    }

    public int addition(int a, int b, int c){
        System.out.println("Sum of integers: "+((a+b)+c));
        return a+b+c;
    }

    public float addition(int a, int b, float c){
        System.out.println("Sum of integers and float: "+((a+b)+c));
        return a+b+c;
    }

    public float addition(float a, int b){
        System.out.println("Sum of float and integer: "+(a+b));
        return a+b;
    }

    public float addition(float a, int b, int c){
        System.out.println("Sum of float and integers: "+(a+(b+c)));
        return a+b+c;
    }

    public String addition(String a, int b, float c){
        System.out.println("Sum of String, integer and float: "+a+" "+(b+c));
        return a+b+c;
    }

    public double addition(int a, double b){
        System.out.println("Sum of integer and double: "+(a+b));
        return a+b;
    }

    public float addition(int a, float b){
        System.out.println("Sum of integer and float: "+(a+b));
        return a+b;
    }
}
