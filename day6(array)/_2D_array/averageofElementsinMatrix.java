package _2D_array;
import java.util.Scanner;
public class averageofElementsinMatrix {
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println(sum/n*n);
        
    }
}
