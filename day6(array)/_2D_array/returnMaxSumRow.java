package _2D_array;
import java.util.Scanner;
public class returnMaxSumRow {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            a[i][j]=s.nextInt();
            }
        }
        int m=0,sm=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=a[i][j];
            }
        if(sum>m)
        {
            m=sum;
            sm=i;
        }
        System.out.println("sum of "+i+" row->"+sum );
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(sm==i)
                {
                    System.out.print("Maximum Sum of row"+a[i][j]+" ");
                }
            }
        }
    }
}
