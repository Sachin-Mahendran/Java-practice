import java.util.Scanner;
public class sumoffactors {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int su=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                su=su+i;
            }
        }
        System.out.println(su);
}
}