package _1D_array;
import java.util.Scanner;
public class dutchNationalFlagAlgorithm {
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
        int l=0,m=0,h=n-1;
        while(m<=h)
        {
            if(a[m]==0)
            {
                int t=a[l];
                a[l]=a[m];
                a[m]=t;
                l++;
                m++;
            }
            else if(a[m]==1)
            {
                m++;
            }
            else
            {
                int t=a[m];
                a[m]=a[h];
                a[h]=t;
                h--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
