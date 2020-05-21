package com;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count_max = 0;
        for (int i = 0; i < nums.length; i++)
        {
            count_max+=1;
            if(nums[i]==0)
            {
                count_max = 0;
            }
            else
            {
                max = Math.max(max,count_max);
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
            int[] nums = {1,1,0,1,1,1};
            System.out.println(findMaxConsecutiveOnes(nums));
    }
}
