package NumberBased;

import java.util.Scanner;

public class smallestamongtwo {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a<b)
        {
            System.out.println("smallest number->"+a);
        }
        else{
            System.out.println("smallest number->"+b);
        }
        
    }
}
