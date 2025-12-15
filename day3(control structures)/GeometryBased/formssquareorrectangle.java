package GeometryBased;

import java.util.Scanner;

public class formssquareorrectangle {
        public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        if(a==b&&b==c&c==d&&d==a)
        {
            System.out.println("forms square");
        }
        else if((a==c&&b==d)||(a==b&&c==d))
        {
            System.out.println("forms rectangle");}
        else
        {
            System.out.println("forms other shapes");
        }
}
}