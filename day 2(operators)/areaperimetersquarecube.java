import java.util.Scanner;

public class areaperimetersquarecube {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        Double a=s.nextDouble();
        double ar=6*(a*a);
        double p=12*a;
        double v=a*a*a;
        System.out.println("area of cube:"+ar);
        System.out.println("perimeter of cube:"+p);
        System.out.println("volume of cube:"+v);
    }
}
