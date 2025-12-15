package NumberBased;

import java.util.Scanner;

public class twonumbershavesamelastdigit {
      public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int n1=a%10;
    int n2=b%10;
    if(n1==n2)
    {
        System.out.println("same last digit");
    }
    else
    {
        System.out.println("not same last digit");
    }
}
}
