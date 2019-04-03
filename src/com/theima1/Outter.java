package com.theima1;

public class Outter {
    public class Innner{
        int num=1;
        public void inShow(){
            System.out.println("inshow zhixing"+num);
        }
    }

    public  void outShow(){
        System.out.println("outShow zhixing");
        Innner innner=new Innner();
        innner.inShow();
    }
}
