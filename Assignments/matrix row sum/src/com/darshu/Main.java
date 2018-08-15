package com.darshu;

public class Main {

    public static void main(String[] args) {
        int sum=0,s=0;
        int b[],c[];
        b=new int[3];
        c=new int [3];

        int x[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Given Matrix ");       // matrix
         for(int i = 0; i < 3; i++)
           {
               for(int j = 0; j < 3; j++)
                    {
                       System.out.print(x[i][j] + " ");
                       sum=sum+x[i][j];

                    }
                    b[i]=sum;
                    sum=0;
                    System.out.println(" ");
           }
           System.out.println(" Matrix Row Sum ");   //matrix individual row sum
           for(int i=0;i<3;i++)
           {
               System.out.println(b[i] + " ");
           }

           System.out.println("Matrix Coloum Sum ");
           for(int i=0;i<3;i++ )
               {
                    for(int j=0;j<3;j++)
                      {
                        s=s+x[j][i];

                      }
                      c[i]=s;
                      s=0;
               }
               for(int i=0;i<3;i++)
               {
                   System.out.println(c[i] + " ");
               }


    }
}
