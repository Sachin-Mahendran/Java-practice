package _1D_array;
import java.util.Scanner;
public class firstNonrepeatedElement {
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
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;

                }
            }
            if(c==1)
            {
                System.out.print(a[i]+" ");
                return;
            }
        }
    }
}
