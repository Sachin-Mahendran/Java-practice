package SecondLargest.BruteForce;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {// SORTING(BUBBLE)
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int first=arr[n-1];//finding the first largest after sorting
        System.out.println(first);
        int second=0;//intial value of second largest

        for(int i=n-2;i>=0;i--)//reverse traversing the array from the last previous (if array size =5 the loop starts from 3 to 0 
        //                                                                           skipping the last element for uneessary checks)
        {
            if(arr[i]!=first)
            {
                second=arr[i];
                break;//to return the terminate the next iteration
            }
        }
        System.out.println(second);
    }
}

/* 
[5 | 7 | 3 | 9 | 2] intial array

[2 | 3 | 5 | 7 | 9] array after sorting

first=arr[n-1] =9 max value

second=0

iteration starts from value 7 to 2

7!=9--->true

second=7

break

*/