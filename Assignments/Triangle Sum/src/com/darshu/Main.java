package com.darshu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x[][]={{1,2,3},{4,56,6},{75,8,9}};
        System.out.println(" Given Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(x[i][j] +" ");
            }
            System.out.println(" ");
        }

        System.out.println("Traingle A  ");
         for(int i=0;i<3;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 System.out.print(x[i][j] +" ");
             }
             System.out.println(" ");
         }

         int max=x[0][0];

         for(int i=0;i<3;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 if(max<x[i][j])
                 {
                     max=x[i][j];
                 }
             }
         }
         System.out.println("Triangle A Max="+ max);

         int k=0;

         for(int i=0;i<3;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 k=k+x[i][j];
             }
         }
        System.out.println("Triangle A Sum ="+k);

         for(int i=0;i<3;i++)
         {
             for(int j=0;j<3;i++)
         }

    }
}
