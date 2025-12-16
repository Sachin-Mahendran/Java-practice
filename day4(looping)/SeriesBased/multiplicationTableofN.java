package SeriesBased;

import java.util.Scanner;

public class multiplicationTableofN {
       public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int limit=s.nextInt();
        for(int i=1;i<=limit;i++)
        {
            int m=i*n;
            
            {
                System.out.println(i+"*"+n+"="+m);
            }
        }
    }
}
