import java.util.*;
public class simpleinterest {
     public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        double p=s.nextDouble();
        double n=s.nextDouble();
        double r=s.nextDouble();
        double si=(p*n*r)/100;
        System.out.println(si);
    }
}
