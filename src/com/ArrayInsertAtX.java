package com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertAtX {

    public static void main(String[] args)
    {
        int[] A = new int[8];
        int len = 0;
        for(int i=0;i<7;i++)
        {
            A[i] = i;
            len = i;
        }
        System.out.println(Arrays.toString(A));
        System.out.println(len);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index for insertion: ");
        int position = sc.nextInt();
        System.out.println("Enter the number for insertion: ");
        int no = sc.nextInt();

        for(int i=len;i>=position;i--)
        {
                A[i+1] = A[i];
        }

        A[position] = no;

        System.out.println(Arrays.toString(A));
    }
}
