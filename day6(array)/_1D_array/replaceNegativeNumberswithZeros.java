package _1D_array;
import java.util.*;
public class replaceNegativeNumberswithZeros {

            public static void main(String[]args)
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c++;
            if(a[i]<0&&c!=1)
            {

                a[i]=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        }
    }

