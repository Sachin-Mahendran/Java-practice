package NumberBased;
import java.util.Scanner;
public class productofdigits {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int p=1;
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=n%10;
            p*=t;
            n/=10;
        }
        System.out.println(p);
    }
}
