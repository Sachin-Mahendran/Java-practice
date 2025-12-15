package CharactrBased;
import java.util.*;
public class alphabetornot {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        int a=ch;
    if((a>=65&&a<91)||(a>=97&&a<123)){
            System.out.println("alphabet");
        }
        else
        {
            System.out.println("not an alphabet");
        }
}
}
