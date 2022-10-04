package com.company;

public class Main {

    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7,8,9,0};
     int target= 11;
     int ans=LinearSearch(arr,target);
        System.out.println(ans);

    }
    static int LinearSearch(int arr[], int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
      for( int index=0;index<arr.length;index++)
      {
          int element=arr[index];
          if(element==target)
          {
              return index;
          }

      }
      return -1;
    }
}
