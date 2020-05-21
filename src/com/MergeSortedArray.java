package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m-1,tail2 = n-1,tail_combo = m+n-1;

        while(tail1>=0 && tail2>=0)
        {
            if(nums1[tail1]>nums2[tail2])
                nums1[tail_combo--] = nums1[tail1--];
            else
                nums1[tail_combo--] = nums2[tail2--];
        }

        if(tail1<=0)
        {
            while(tail_combo>=0)
                nums1[tail_combo--]= nums2[tail2--];
        }

    }

    public static void main(String[] Args)
    {
            int[] nums1= {1,2,3,0,0,0};
            int[] nums2 = {2,5,6};
            int m=3,n=3;
            merge(nums1,m,nums2,n);
            System.out.println(Arrays.toString(nums1));
    }
}
