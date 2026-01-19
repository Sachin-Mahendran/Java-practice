package _1D_array;

import java.util.Scanner;

public class sumOfelementsinArray {
       public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+ar[i];
        }
        System.out.print(sum);
    }
}
