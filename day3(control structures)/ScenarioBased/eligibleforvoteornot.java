package ScenarioBased;
import java.util.Scanner;
public class eligibleforvoteornot {
        public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a>=18)
    {
        System.out.println("eligible to vote");
    }
    else
    {
        System.out.println("not eligible to vote");
    }
}
}
