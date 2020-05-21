package com;

import java.util.Arrays;

public class DuplicateZeroes {

    public static void shift(int[] A,int ind)
    {
            for(int i=A.length-1;i>=ind;i--)
            {
                A[i] = A[i-1];
            }
    }

    public static void duplicateZeroes(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==0)
            {
                shift(A,i+1);
                i++;
            }
        }

    }

    public static void main(String[] Args)
    {
        int[] A = {1,0,2,3,0,4,5,0};
        duplicateZeroes(A);
        System.out.println(Arrays.toString(A));
    }
}
