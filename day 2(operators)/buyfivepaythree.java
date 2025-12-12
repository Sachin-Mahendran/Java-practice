import java.util.Scanner;

public class buyfivepaythree {
public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int a=s.nextInt();
        int dis=p/5;
        int sm=(p-2*dis)*a;
        System.out.println(sm);
    }
}
