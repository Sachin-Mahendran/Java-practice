package SeriesBased;
import java.util.*;
public class sumofpositive {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int num;
        while(true)
        {
            num=s.nextInt();
            if(num<0)
            {
                break;
            }
            sum=sum+num;}
            System.out.println(sum);

        }
    }