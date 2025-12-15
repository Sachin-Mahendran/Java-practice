package NumberBased;

import java.util.Scanner;

public class lastdigitisdivisiblebythree {
    
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=a%10;
    if(b%3==0)
    {
        System.out.println("yes divisible by 3");
    }
    else
    {
        System.out.println("not divisible by 3");
    }
}
}
