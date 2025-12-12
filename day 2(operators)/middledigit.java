import java.util.Scanner;
public class middledigit {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        a=a%100;
        a=a/10;
        System.out.println("middle digit->"+a);
    }
}
