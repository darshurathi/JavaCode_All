package com.darshu;

public class Matrix{
     private int c=0,b=0,row=0;
         public void max(int x[][])
         {

             System.out.println("Given Matrix :");
             for(int i=0;i<5;i++) {
                 for(int j=0;j<5;j++) {
                     System.out.print(x[i][j]+" ");
                     }System.out.println(" ");
             }

             for(int i=0;i<5;i++)
             {
                 c=0;
                 for(int j=0;j<5;j++)
                 {
                     if(x[i][j]==1)
                     {
                         c++;
                     }

                 }
                 if(c>b) {b= c; row =i;}
             }

             System.out.println("Max In One row ="+ row);
         }


}
