package _1D_array;
import java.util.Scanner;
public class removeDuplicates {
        public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                   c++;
                   break;
                }
            }
        if(c==0)
        {
            System.out.print(a[i]+" ");
        }
    }
}
}
