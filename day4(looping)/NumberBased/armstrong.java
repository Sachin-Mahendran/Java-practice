import java.util.Scanner;
public class armstrong {
     public static void main(String[]args)
    {
        Scanner st=new Scanner(System.in);
        int s,d=0;
        int n=st.nextInt();
        int o=n;
        while(n!=0)
        {
            s=n%10;
            d=d+(s*s*s);
            n/=10;
        }
        if(d==o)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }

    }
}
