package NumberBased;
import java.util.*;
public class countdigits {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        while(n!=0)
        {
            n/=10;
            c++;
        }
        System.out.println(c);
    }
}
