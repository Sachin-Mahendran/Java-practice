package DigitBased;

import java.util.Scanner;

public class removeAllZeros {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int c=0,su=0;
        while(t>0)
        {
            c=t%10;
            su=(su*10)+c;
            t/=10;
        }
        while(su>0)
        {
            int d=su%10;
            su/=10;
            if(d!=0)
            System.out.print(d);
        }
        
        
    }
}
