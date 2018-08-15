package com.darshu;

public class Array {
    public void traingle(int x[])
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(x[j]+" ");
            }
            System.out.println(" " );
        }
    }
}
