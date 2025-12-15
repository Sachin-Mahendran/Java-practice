package ScenarioBased;
import java.util.*;
public class discountfordifferentbills {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        double b=s.nextDouble();
        int d=0;
        if(b<=500)
        {
            d=5;
        }
        else if(b>=4000&&b<=5000)
        {
            d=10;
        }
        else if(b>=5000&&b<=25000)
        {
            d=25;
        }
        else if(b>=25000&&b<=50000)
        {
            d=50;
        }
        else
        {
            System.out.println(d*70);
        }
        double am=(b*d)/100;
        double fi=b-am;
        System.out.println(d+"%");
}
}