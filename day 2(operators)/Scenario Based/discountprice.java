import java.util.Scanner;

public class discountprice {
      public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        double p=s.nextDouble();
        double d=s.nextDouble();
        double di=(d/100)*p;
        System.out.println(p-di);
    }
}
