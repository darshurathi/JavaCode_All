package com.darshu;

public class B extends A{
    {
        System.out.println("CLASS B init block");  // init block
    }
    B()
    {
       super(50);
        System.out.println("CLASS B");
    }
    B(int y)
    {

        System.out.println("y="+y);
    }



}

