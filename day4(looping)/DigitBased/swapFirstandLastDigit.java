package DigitBased;

import java.util.Scanner;

public class swapFirstandLastDigit {
public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int first=n;
    int last=n%10;
    int d=0;
    while(first>=10)
    {
        first=first/10;
        d++;

    }
    int middle=(n%(int)Math.pow(10,d))/10;
    int r=last*(int)Math.pow(10,d)+middle*10+first;
    System.out.println(r);
}
}
