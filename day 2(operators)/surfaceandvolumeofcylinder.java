import java.util.Scanner;

public class surfaceandvolumeofcylinder {
    {
        Scanner s=new Scanner(System.in);
        Double r=s.nextDouble();
        double h=s.nextDouble();
        double pi=3.14;
        double v=pi*(r*r)*h;
        double su=2*pi*r*(r+h);
        System.out.println("surface area of cylinder:"+su);
        System.out.println("volume of cylinder:"+v);
    }
}
