package com.theima1;

public class Demo8 {
    public static void main(String[] args) {
       Animal a=new Animal(){

            @Override
            public void eat(Animal a) {
                System.out.println("猪拱白菜");
            }
        };
       a.eat(a);

       a.eat(new Animal(){

           @Override
           public void eat(Animal a) {
               System.out.println("鱼喝水");
           }
       });

      
    }
}
