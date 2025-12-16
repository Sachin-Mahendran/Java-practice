import java.util.*;
public class strongnumberornot {
    public static void main(String[]args)
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int o=n,su=0;
        while(n!=0)
        {
            int d=n%10;
            int fact=1;
        for(int i=1;i<=d;i++)
        {
            fact=fact*i;
        }
        su=su+fact;
        n=n/10;
    }
    if (su==o)
        System.out.println("strong num");
    else
        System.out.println("no strong num");
}
}
