package YearBased;
import java.util.Scanner;
public class centuryornot {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a%100==0)
    {
        System.out.println("yes century");
    }
    else
    {
        System.out.println("not ");
    }
}
}
