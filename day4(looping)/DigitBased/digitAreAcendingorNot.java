package DigitBased;

import java.util.Scanner;

public class digitAreAcendingorNot {
    public static void main(String[]args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int t=n;
    int c=0;
    while(n>=10)
    {
        int l=n%10;
        int nx=(n/10)%10;
        if(nx>l)
        {
            c++;
        }
       n=n/10;
    }
    if(c==0)
    {
        System.out.println("as");
    }
    else{
        System.out.println("not as");
    }
}
}
