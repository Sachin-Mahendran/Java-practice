import java.util.Scanner;

public class perfectnumberornot {
      public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int su=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                su=su+i;
            }
        }
        if(su==n)
        {
        System.out.println("perfecct");}
        else{
            System.out.println("not perfect");
        }
}
}
