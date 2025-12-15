package GeometryBased;
import java.util.*;
public class rightangledtriangleornot {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if((a+b+c==180)||(a==90||b==90||c==90))
        {
            System.out.println("rightangled triangle");
        }
        else 
        {
            System.out.println("not a rightangled");}
    }
}