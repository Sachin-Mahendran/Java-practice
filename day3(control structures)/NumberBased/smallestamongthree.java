package NumberBased;

import java.util.Scanner;

public class smallestamongthree {
public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if((a<b)&&(a<c))
        {
            System.out.println("small number->"+a);
        }
        if((b<a)&&(b<c))
        {
            System.out.println("small number->"+b);
        }
        else{
            System.out.println("smallest number->"+c);
        }
        
    }
}
