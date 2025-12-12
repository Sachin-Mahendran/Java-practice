import java.util.*;
public class fistandlastofthreedigit {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("first digit->"+a/100);
        System.out.println("last digit->"+a%10);
    }
}
