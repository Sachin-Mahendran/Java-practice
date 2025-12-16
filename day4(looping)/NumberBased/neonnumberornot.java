package NumberBased;
import java.util.Scanner;
public class neonnumberornot {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int sum=0,p=1;
        int n=s.nextInt();
        int o=n,sq=n*n;
        while(sq!=0)
        {
            sum=sum+(sq%10);
            sq/=10;
        }
        if(sum==n)
        System.out.println("neon number");
        else
        System.out.println("not neon");
    }
}
