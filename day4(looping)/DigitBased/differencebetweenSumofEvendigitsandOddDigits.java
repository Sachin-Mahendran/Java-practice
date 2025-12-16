package DigitBased;

import java.util.Scanner;

public class differencebetweenSumofEvendigitsandOddDigits {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int c=0,a=0,sumo=0,sume=0;
        while(n>0)
        {
            int d=n%10;
            if(d%2!=0)
            {
                sumo+=d;
            }
            else if(d%2==0)
            {
                sume+=d;

            }
            n/=10;
        }
        System.out.println(sume-sumo);
        
    }
}
