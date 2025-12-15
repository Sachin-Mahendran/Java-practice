package ScenarioBased;
import java.util.Scanner;
public class passangerage {
    public class eligibleforvoteornot {
        public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a>18)
    {
        System.out.println("child");
    }
    else if(a<=18&&a<=60)
    {
        System.out.println("adult");
    }
    else
    {
        System.out.println("senior");
    }
}
    }
}
