package DigitBased;
import java.util.Scanner;
public class occurenceOfDigit {
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
    System.out.println(c);
}
}

