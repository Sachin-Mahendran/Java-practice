package methodpractice.methodimplementationtypes;
import java.util.Scanner;
public class methodwithRwithoutArg {
    static int facto()//with return type wihtout argument 
    {
        //definition
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//input should be get inside the method
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(facto( ));
    }
}
