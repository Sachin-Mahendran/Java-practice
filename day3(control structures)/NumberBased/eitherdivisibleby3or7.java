package NumberBased;
import java.util.Scanner;
public class eitherdivisibleby3or7 {
    
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a%3==0)
    {
        System.out.println("divisible by 3");
        if(a%7==0)
        {
            System.out.println("divisible by 7");
        }
    }
    else
    {
        System.out.println("not divisible by 3&7");
    }
}
}
