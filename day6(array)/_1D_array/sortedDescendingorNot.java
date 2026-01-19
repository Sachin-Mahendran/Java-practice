package _1D_array;

import java.util.Scanner;

public class sortedDescendingorNot {
          public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                a[i]=a[i+1];
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("sorted descending");
        }
        else
        {
            System.out.println("not");
        }
    }
}
