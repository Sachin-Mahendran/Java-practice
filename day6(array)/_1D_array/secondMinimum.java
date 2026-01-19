package _1D_array;
import java.util.*;
public class secondMinimum {
public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,c=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++)
        {
            a[j]=s.nextInt();
        }
        int m=Integer.MAX_VALUE;
        int sm=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<m)
            {
                sm=m;
                m=a[i];
            }
            else if(a[i]>sm && a[i]!=m)
            {
                sm=a[i];
            }
        }
        System.out.println(sm);                      
    }
}
