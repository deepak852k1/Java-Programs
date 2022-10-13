package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
int arr[]={5,4,3,2,1,8,7,6,9,3,2,5,6,7,8,9};
bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void bubble(int arr[])
    {
        for( int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }


    }
}
