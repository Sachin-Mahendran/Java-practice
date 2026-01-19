package _1D_array;
import java.util.Scanner;
public class isArrayHasDuplicates {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {

            if(ar[i]==ar[j])
            {
                c++;
                break;

            }
            if (c!=0)
            {
                break;
            }
        }}
        if(c!=0)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
