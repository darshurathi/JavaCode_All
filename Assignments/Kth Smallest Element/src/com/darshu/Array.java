package com.darshu;

public class Array {
    public void small(int x[])
    {
        int min=x[0],c=1;
        System.out.println("Given Array ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i] +" ");
        }
        System.out.println(" ");


        for(int j=1;j<9;j++)
            {
                  if(min>x[j])
                    {
                      min = x[j];
                    }
            }
            System.out.println("min=" +
                    ""+min);
        }
    }

