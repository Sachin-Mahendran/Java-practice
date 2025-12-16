import java.util.Scanner;
public class buzzNumberforNterms {
       public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c=0;
        for(int i=0;i<n;i++)
        {
            if(i%7==0||i%10==7)
            {
                System.out.println(i);
            }
         
        }
    }
}
