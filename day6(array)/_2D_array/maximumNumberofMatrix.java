package _2D_array;
import java.util.Scanner;
public class maximumNumberofMatrix {
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
        for(int i=0;i<n;i++)
        {
            int m=a[i][0];
            for(int j=0;j<n;j++)
            {
            if(a[i][j]>m)
            {
                m=a[i][j];
            }
        }
        System.out.println(m);
        }
        
    }
}
