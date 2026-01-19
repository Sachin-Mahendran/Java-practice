package _2D_array;
import java.util.Scanner;
public class matrixAddition {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=s.nextInt();
        }
        }
        
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++)
            {
                sum=a[i][j]+b[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
            
        }
    }
}
