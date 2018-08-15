package com.darshu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);



        int arr3[] = {1, 2, 4, 5, 6};
        int arr4[] = {2, 3, 5, 7};
        int l = arr1.length;
        int k = arr2.length;
        printIntersection(arr1, arr2, m, n);
    }
}
