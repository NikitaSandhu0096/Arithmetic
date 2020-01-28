package com.lambton;

public class Arithmetic {
    public int addition(int a, int b){
        return a+b;
    }

    public float addition(float a, float b){
        return a+b;
    }

    public String addition(String a, String b){
        return a+b;
    }

    public String addition(String a, int b){
        return a+b;
    }

    public String addition(int a, String b){
        return a+b;
    }

    public int addition(int a, int b, int c){
        return a+ addition(a,b);
    }

    public float addition(int a, int b, float c){
        return (float)addition(a,b)+c;
    }

    public float addition(float a, int b){
        return a+(float)b;
    }

    public float addition(float a, int b, int c){
        return a+(float)addition(a,b);
    }

    public String addition(String a, int b, float c){
        return a+(String)addition(a,b);
    }

    public double addition(int a, double b){
        return a+b;
    }

    public float addition(int a, float b){
        return a+b;
    }
}
