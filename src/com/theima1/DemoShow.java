package com.theima1;

public class DemoShow {
    public static void main(String[] args) {
        Outter outter=new Outter();
        outter.outShow();
        System.out.println("================");
        Outter.Innner innner=new Outter().new Innner();
        innner.inShow();
    }
}
