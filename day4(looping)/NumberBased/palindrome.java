import java.util.Scanner;

public class palindrome {
     public static void main(String[]args)
    {
        Scanner st=new Scanner(System.in);
        int s=0,d;
        int n=st.nextInt();
        int o=n;
        while(n!=0)
        {
            d=n%10;
            s=(s*10)+d;
            n/=10;
        }
        System.out.println(s);
    }
}
