import java.util.*;
public class swapwithoutthirdvariable {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=b-a;
        System.out.println("a value->"+a+"\n"+"b value->"+b);
    }
}
