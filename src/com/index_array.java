package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class index_array {

    public static int[] ind_array(int[] A)
    {
        int[] index = new int[A.length+1];
        for(int i=0;i<A.length;i++)
            for(int j=0;j<A.length;j++)
            {
                if(i==A[j])
                    index[i]=index[i]+1;
                else if(i==A.length-1 && A[j]==index.length-1)
                    index[index.length-1]++;
            }


        return index;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        int[] ret_array = ind_array(nums);
        for(int i=1;i<ret_array.length;i++)
        {
            if(ret_array[i]==0)
                l.add(i);
        }
        return l;

    }



        public static void main(String[] args)
    {
        int[] arr = {4,3,2,7,8,8,3,1};
        List<Integer> li = findDisappearedNumbers(arr);
        for(int a:li)
            System.out.print(a+" ");
    }
}
