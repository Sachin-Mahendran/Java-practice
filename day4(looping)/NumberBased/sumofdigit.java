package NumberBased;
import java.util.*;
public class sumofdigit {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            sum=sum+(n%10);
            n/=10;
        }
        System.out.println(sum);
    }
}
