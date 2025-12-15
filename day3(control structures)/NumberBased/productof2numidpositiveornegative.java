package NumberBased;
import java.util.*;
public class productof2numidpositiveornegative {
         public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int p=a*b;
        if(p>=0)
        {
            System.out.println("positive");
        }
        else 
        {
            System.out.println("negative");
        }
        
    }
}
