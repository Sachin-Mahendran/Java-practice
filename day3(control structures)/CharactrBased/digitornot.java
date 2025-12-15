package CharactrBased;
import java.util.Scanner;
public class digitornot {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        int a=ch;
        if(a>=48&&a<58)
        {
            System.out.println("yes digit");
        }
        else
        {
            System.out.println("not a digit");
        }
}
}
