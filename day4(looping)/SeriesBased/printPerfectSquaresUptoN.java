import java.util.Scanner;

public class printPerfectSquaresUptoN {
        public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            double r=Math.sqrt(i);
            if(r*r==i)
            {
                System.out.println(i);
            }
        }
    }
}
