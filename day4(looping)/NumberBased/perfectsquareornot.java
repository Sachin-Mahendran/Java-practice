import java.util.Scanner;
public class perfectsquareornot {
         public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                c++;
                break;
            }
        }
        if(c==1)
            {
                System.out.println("perfect square");
            }
        else{
             System.out.println("not perfect");
        }
}
}
