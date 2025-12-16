import java.util.Scanner;
public class printPowerof2numbersbetween1toN {
       public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if((i&(i-1))==0)
            {
                System.out.println(i);
            }
        }
    }
}


