package YearBased;

import java.util.Scanner;

public class firstandlast2digitofyearequalornot {
     public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if((a%4)==0)
    {
        System.out.println("leap year");
    }
    else
    {
        System.out.println("not leap year");
    }
}
}
