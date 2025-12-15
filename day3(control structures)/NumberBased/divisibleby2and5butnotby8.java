package NumberBased;
import java.util.*;
public class divisibleby2and5butnotby8{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0)
        {
            if(a%5==0)
            {
                if(a%8!=0)
                {
                    System.out.println("divisible by 2 and 5 not by 8");
                }
            }
            else{
                System.out.println("not divisible by 5 but with 8");
            }
        }
        else{
            System.out.println("not divisible by 2 and 5 but with 8");
        }

    }

}
