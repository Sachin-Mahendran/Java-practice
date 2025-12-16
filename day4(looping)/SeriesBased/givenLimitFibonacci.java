import java.util.Scanner;
public class givenLimitFibonacci {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c=0;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
