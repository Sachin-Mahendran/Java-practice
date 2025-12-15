package CharactrBased;

import java.util.Scanner;

public class checkinguppercaselowercaseorspaecialsymbols {
         public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        int a=ch;
        if(a>=32&&a<48||a>=58&&a<65||a>=91&&a<97||a>=123&&a<128)
        {
            System.out.println("special characters");
        }
        else if(a>=65&&a<91){
            System.out.println("upper case");
        }
        else if(a>=97&&a<123)
        {
            System.out.println("lower case");
        }
        else if(a>=48&&a<58)
        {
            System.out.println("numbers");
        }
        else
        {
            System.out.println("other characters");
        }
    }
}
