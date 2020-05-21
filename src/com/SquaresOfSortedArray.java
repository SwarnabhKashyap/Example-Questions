package com;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] squares(int[] A)
    {
        int[] new_arr = new int[A.length];
        for(int i =0;i<A.length;i++)
        {
            new_arr[i] = A[i]*A[i];
        }

        return new_arr;
    }
    public static int[] sortedSquares(int[] A)
    {
            int[] new_arr = squares(A);
            Arrays.sort(new_arr);
            return  new_arr;

    }

    public static void main(String[] Args)
    {
            int[] nums = {-7,-3,2,3,11};
            System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
