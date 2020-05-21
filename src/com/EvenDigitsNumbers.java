package com;

public class EvenDigitsNumbers {

    public static int noOfDigits(int no)
    {
        int digits = 0;
        while(no>0)
        {
            no = no/10;
            digits++;
        }

        return digits;
    }

    public static boolean isEven(int no)
    {
        return no%2==0?true:false;
    }

    public static int solution(int[] nums)
    {
        int count_even = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(isEven(noOfDigits(nums[i])))
            {
                    count_even++;
            }
        }
        return count_even;
    }
    public static void main(String[] Args)
    {
            int[] nums = {12,345,2,6,7896};

            System.out.println(solution(nums));
    }
}
