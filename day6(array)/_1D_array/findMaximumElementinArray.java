package _1D_array;
import java.util.Scanner;
public class findMaximumElementinArray {
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
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        System.out.println(m);
        
    }
}
