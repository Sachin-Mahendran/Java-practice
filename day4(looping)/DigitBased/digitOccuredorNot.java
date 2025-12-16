package DigitBased;

import java.util.Scanner;

public class digitOccuredorNot {
public static void main(String[]args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int d=s.nextInt();
    int c=0;
    while(n>0)
    {
        int r=n%10;
        if(r==d)
        {
            c++;
        }
        n/=10;
    }
    if(c==0)
    System.out.println("not occured");
    else
    System.out.println("occured");
}
}
