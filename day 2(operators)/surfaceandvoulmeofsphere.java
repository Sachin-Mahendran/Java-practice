import java.util.Scanner;

public class surfaceandvoulmeofsphere {
    {
        Scanner s=new Scanner(System.in);
        Double r=s.nextDouble();
        double pi=3.14;
        double v=(1.33)*pi*(r*r*r);
        double su=4*pi*(r*r);
        System.out.println("surface area of sphere:"+su);
        System.out.println("volume of sphere:"+v);
    }
}
