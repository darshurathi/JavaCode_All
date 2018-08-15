package com.darshu;

public class C extends B{
    {
        System.out.println("CLASS  C init block");
    }
    C()
    {
       super(40);
        System.out.println("CLASS C");
    }
    C(int x)
    {

     System.out.println(" x="+x);
    }





}
