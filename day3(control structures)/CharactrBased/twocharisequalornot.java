package CharactrBased;
import java.util.*;
public class twocharisequalornot {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        char ch2=s.next().charAt(0);
        int a=ch;
        if(ch==ch2)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
}    
}
