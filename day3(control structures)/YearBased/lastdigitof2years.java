package YearBased;
import java.util.Scanner;
public class lastdigitof2years {
     public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int a1=a%10;
    int b2=b%10;
    if(a1==b2)
    {
        System.out.println("equql");
    }
    else
    {
        System.out.println("not equal");
    }
}
}
