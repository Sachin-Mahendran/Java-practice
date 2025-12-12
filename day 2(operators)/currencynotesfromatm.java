import java.util.Scanner;

public class currencynotesfromatm {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int fivehundred=a%500;//300
        int twohundred=a%500/200;
        int hundred=a%500%200/100;
        System.out.println(fivehundred+"\t"+twohundred+"\t"+hundred);


    }
}
