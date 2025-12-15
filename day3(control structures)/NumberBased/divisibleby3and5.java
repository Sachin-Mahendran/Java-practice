package NumberBased;
import java.util.Scanner;
public class divisibleby3and5 {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if((a%3==0)&&(a%5==0))
    {
        System.out.println("yes divisible by 3 and 5");
    }
    else
    {
        System.out.println("Not divisible by 3 and 5");
    }
}
}
