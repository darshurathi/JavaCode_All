package com.darshu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x[][]= {{0, 0, 0, 1, 1},
                    {0, 0, 1, 1, 1},
                    {0, 0, 0, 0, 1},
                    {0, 1, 1, 1, 1},
                    {0, 0, 1, 1, 1}
        };

        Matrix r1=new Matrix();
        r1.max(x);

     }
}
