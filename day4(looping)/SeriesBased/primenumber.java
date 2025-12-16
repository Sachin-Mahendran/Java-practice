package SeriesBased;
import java.util.*;
public class primenumber {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<=n;i++)
        {
            int d=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    d++;
                }
            }
            if(d==2)
            {
                System.out.println(i);
            }
        }
    }
}
