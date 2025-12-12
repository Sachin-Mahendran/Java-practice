import java.util.Scanner;

public class areaperimetersurfacecuboid {
public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        Double l=s.nextDouble();
        double w=s.nextDouble();
        double h=s.nextDouble();
        double v=w*l*h;
        double su=2*((l*w)+(w*h)+(h*l));
        System.out.println("surface area of cuboid:"+su);
        System.out.println("volume of cuboid:"+v);
    }
}
