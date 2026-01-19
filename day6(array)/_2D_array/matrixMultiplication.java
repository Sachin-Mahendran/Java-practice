package _2D_array;
import java.util.Scanner;
public class matrixMultiplication {
       public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int m1=s.nextInt();
        int a[][]=new int[n1][m1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
            a[i][j]=s.nextInt();
            }
        }
        int n2=s.nextInt();
        int m2=s.nextInt();
        int b[][]=new int[n2][m2];
        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<m2;j++)
            {
                b[i][j]=s.nextInt();
        }
        }
        if(m1!=n2)
        {
            System.out.println("matrix cannot be multplied");
            return;
        }

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m2;j++)
            {
                int sum=0;
                for(int k=0;k<m1;k++)
                {
                sum+=a[i][k]*b[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
            
        }
}
}
