import java.util.*;
public class hallowHourGlass {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=(i*2)-1;k++)
            {
                if(k==(i*2)-1||k==1||i==n){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=(i*2)-1;k++)
            {
                if(k==(i*2)-1||k==1||i==n){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
