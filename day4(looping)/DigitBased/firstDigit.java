package DigitBased;
import java.util.*;
public class firstDigit {
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int t=n;
    while(n>=10)
    {
        n/=10;

    }
    System.out.println(n);
  }  
}
