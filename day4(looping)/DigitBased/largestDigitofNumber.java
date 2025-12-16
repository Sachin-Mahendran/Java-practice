package DigitBased;
import java.util.Scanner;
public class largestDigitofNumber {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int max=0;
        while(n>0)
        {
            int d=n%10;
            if(d>max)
            {
                max=d;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
