package com.lambton;

public class Main {
    public static void main(String[] args) {
        Arithmetic a=new Arithmetic();
        a.addition(2,3);
        a.addition(5.0f,4.5f);
        a.addition("Nikita","Sandhu");
        a.addition("Nikita",13);
        a.addition(13,"Sandhu");
        a.addition(14,15, 16);
        a.addition(17,18, 19.5f);
        a.addition(7.5f,4);
        a.addition(19.5f,17, 18);
        a.addition("Nikita",13, 25.3f);
        a.addition(15,16.5);
        a.addition(15,16.5f);
    }
}
