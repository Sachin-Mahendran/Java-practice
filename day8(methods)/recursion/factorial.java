package recursion;
import java.util.Scanner;
public class factorial {
    static int facto(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n*facto(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        System.err.println(facto(n));
    }
}
