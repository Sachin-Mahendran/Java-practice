package GeometryBased;
import java.util.*;

import NumberBased.eitherdivisibleby3or7;
public class triangleisequilateralisoscelesorscalen {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a==b&&b==c&&c==a)
        {
            System.out.println("equilateral");
        }
        else if(a==b||b==c||c==a)
        {
            System.out.println("isosceles");
        }
        else
        {
            System.out.println("scalen");
        }
        
    }
}
