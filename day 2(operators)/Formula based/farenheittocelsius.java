import java.util.Scanner;

public class farenheittocelsius {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        double f=s.nextInt();
        double c=(f-32)*0.55;
        System.out.printf("%.2f",c);
    }
}
