package GeometryBased;

import java.util.Scanner;

public class validtriangleusingsides {
        public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if((a+b<c||b+c<a||c+a<b))
        {
            System.out.println("valid triangle");
        }
        else 
        {
            System.out.println("not a valid traingle");}
        }
    
}
