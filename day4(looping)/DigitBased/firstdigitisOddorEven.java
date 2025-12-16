package DigitBased;

import java.util.Scanner;

public class firstdigitisOddorEven {
     public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int t=n;
    while(n>=10)
    {
        n/=10;

    }
    if(n%2==0)
    System.out.println("even");
    else
    System.out.println("odd");
}
}