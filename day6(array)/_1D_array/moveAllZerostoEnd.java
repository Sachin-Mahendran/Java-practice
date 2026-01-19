package _1D_array;
import java.util.Scanner;
public class moveAllZerostoEnd {
            public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        int start=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]!=0)
            {
                int temp=ar[start];
                ar[start]=ar[i];
                ar[i]=temp;
                start++;
            }
            
        }
        for(int i=0;i<n;i++)
        {
           System.out.print(ar[i]+" "); 
        }
        }
        
    }
