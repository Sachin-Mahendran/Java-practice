package _1D_array;

import java.util.Scanner;

public class arrayHaasDistinctElements {
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
            for(int j=i+1;j<n;j++)
            {
            if(a[i]==a[j])
            {
                c++;
                break;
            }
        }
            if(c==1)
            {
                break;
            }
        
        }
        if(c==0)
        {
            System.out.println("yes Distinct elemts");
        }
        else
        {
            System.out.println("no distinct elements");
        }
    }
}
