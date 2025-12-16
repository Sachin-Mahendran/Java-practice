package DigitBased;

import java.util.Scanner;

public class alldigtisAreoddOrEven {
    
     public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int c=0,a=0;
        while(n>0)
        {
            int d=n%10;
            if(d%2!=0)
            {
                c++;
            }
            a++;
            n/=10;
        }
        if(c==0)
        {
            System.out.println("even");
        }
        else if(c==a)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("mixed");
        }

        
    }
}
