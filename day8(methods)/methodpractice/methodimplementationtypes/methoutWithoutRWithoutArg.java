package methodpractice.methodimplementationtypes;
import java.util.*;
public class methoutWithoutRWithoutArg {
    static void facto()//without return type and without argument
    {
        //definition
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        //call
        facto();
    }
}
