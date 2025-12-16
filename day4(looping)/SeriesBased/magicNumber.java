import java.util.Scanner;
public class magicNumber {
       public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=1;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            while(num>9)
            {
                int sum=0;
                while(num>0)
                {
                    sum+=num%10;
                    num/=10;
                }
                num=sum;;
            }
            if(num==1)
            {
                System.out.println(i);
            }
        }
       
}
}