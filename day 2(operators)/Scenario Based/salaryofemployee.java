import java.util.Scanner;
public class salaryofemployee {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        double days=s.nextDouble();
        final double amount=2000;
        double salary=days*amount;
        System.out.println(salary);
    }
}
