package com.darshu;

public class block {
    private int q,w;
    {
        System.out.println("you are inside the init block");
    }

    public block()
    {
        System.out.println("first constructor");
    }
    public block(int x,int y )
    {
        q=x;
        w=y;
        System.out.println("new value of q="+q);
        System.out.println("new value of w="+w);

    }
}
