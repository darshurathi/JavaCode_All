package com.darshu;

public class defaultC {
    private int a,b;

    public defaultC(int x,int y)
    {
        a=x;
        b=y;
    }
    public defaultC(defaultC z)
    {
        this.a=z.a;
        this.b=z.b;
    }
    public void show() {
        System.out.println("copy value of a=" + a);
        System.out.println("copy value of b=" + b);
    }


}
