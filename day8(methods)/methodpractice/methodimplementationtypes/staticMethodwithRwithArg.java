package methodpractice.methodimplementationtypes;
import java.util.*;
 public class staticMethodwithRwithArg{
    //declaration
    static int facto(int n)//with return type with argument
    {
        //definition
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(facto( n));
    }
}
