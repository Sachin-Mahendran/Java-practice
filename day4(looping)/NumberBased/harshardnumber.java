package NumberBased;
import java.util.Scanner;
public class harshardnumber {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int n=s.nextInt();
        int o=n;
        while(o!=0)
        {
            sum=sum+(o%10);
            o/=10;
        }
        if(n%sum==0)
        System.out.println("harshard number");
        else
            System.out.println("not harshard ");
    }
}
