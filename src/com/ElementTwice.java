package com;

import java.util.Arrays;

public class ElementTwice {

    public static boolean elementTwice(int[] arr){
        Arrays.sort(arr);
        int count_zero = 0;
        for(int a: arr)
        {
            if(a!=0)
            {
                if(BinarySearchh(arr,a) && BinarySearchh(arr,2*a))
                    return true;
            }
            else
                count_zero++;
        }

        return count_zero>=2;
    }

    public static boolean BinarySearchh(int[] arr,int x)
    {
        int low = 0,high=arr.length-1,mid=0;

        while(low<=high)
        {
            mid = (int) (low+high)/2;

            if(arr[mid] == x)
                return true;
            else if(arr[mid]>x)
                high = mid-1;
            else
                low = mid+1;
        }

        return false;

    }
    public static void main(String[] args)
    {
        int[] arr = {10,2,5,3};
        System.out.println(elementTwice(arr));
    }
}
