package com;

public class max_occurences {
        //Complete this function, Geeks
        public int majorityWins(int arr[],int n,int x,int y)
        {
            int count_x=0;//counter to count frequency of x
            int count_y=0;//counter to count frequency of y

            /******************************************
             Your code goes here, Geeks
             *******************************************/
            for(int i=0;i<n;i++)
            {
                if(arr[i]==x)
                    count_x++;
                else if(arr[i]==y)
                    count_y++;
            }
            if(count_x>count_y)
            {
                return x;
            }
            else if(count_x==count_y)
            {
                return Math.min(x,y);
            }

            return y;

        }
    }
