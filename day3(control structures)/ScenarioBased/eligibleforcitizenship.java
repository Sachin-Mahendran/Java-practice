package ScenarioBased;
import java.util.Scanner;
public class eligibleforcitizenship {
        public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a>=60)
    {
        System.out.println("eligible for senior citizenship");
    }
    else
    {
        System.out.println("not eligible for senior citizenship");
    }
}
}
