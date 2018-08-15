package com.darshu;
import java.util.Scanner;
public class temp {
    private int x,y;
    public void getdata()
    {
        Scanner readme = new Scanner(System.in);
        System.out.printf("Enter Two Value :");
        x=readme.nextInt();
        y=readme.nextInt();

    }
    public void display()
    {
        System.out.println("the value  of x is ="+x);
        System.out.println("the value  of y is ="+y);

    }

}
