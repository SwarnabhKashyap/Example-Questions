package com;

public class RotateArray {
    public static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int[] temp = new int[d];
        for(int i=0;i<d;i++)
            temp[i] = arr[i];
        int len = d;
        while(len>=1)
        {
            for(int j=d-1;j<n-1;j++)
            {
                arr[j] = arr[j+1];
            }
        }

        for(int i=n-d+1,j=0;i<n;i++,j++)
        {
            arr[i] = temp[j];
        }
    }

    public static void main(String[] args)
    {

    }
}
