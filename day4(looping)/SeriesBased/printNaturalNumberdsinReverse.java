package SeriesBased;
import java.util.Scanner;
public class printNaturalNumberdsinReverse {
     public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.print(i+" ");
        }
    }
}
