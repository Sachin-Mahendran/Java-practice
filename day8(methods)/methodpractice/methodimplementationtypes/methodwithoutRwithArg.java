package methodpractice.methodimplementationtypes;
import java.util.Scanner;
public class methodwithoutRwithArg {
    static void facto(int n)//without return type with argument 
    {
        //definition
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);//should use print statment

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        facto(n);//call the method 
    }
}
