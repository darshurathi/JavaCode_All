package com.darshu;

public class constructor {
     public constructor()
     {
         this(10);
         System.out.println("default");

    }
    public constructor(int x)
    {
        this(30,40);
        System.out.println("value of x ="+x);
    }

    public constructor(int a,int b)
    {
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
        System.out.println("sum of a and b="+a+b);
    }





}
