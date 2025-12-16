package DigitBased;
import java.util.Scanner;
public class smallestDigitofNumber {
     public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int min=9;
        while(n>0)
        {
            int d=n%10;
            if(d<min)
            {
                min=d;
            }
            n/=10;
        }
        System.out.println(min);
    }
}
