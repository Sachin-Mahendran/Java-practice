package DigitBased;

import java.util.Scanner;

public class frequencyOfdigit {
    public static void main(String[]args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int t=n;
    while(t>0)
    {
        int d=t%10;
        int c=0;
        int ch=n;
        while(ch>0)
        {
            if(ch%10==d)
            {
                c++;
            }
            ch/=10;
        }
        System.out.println(d+"->"+c);
        while(t>0&&t%10==d)
        {
            t/=10;
        }

    }
    

}
}
