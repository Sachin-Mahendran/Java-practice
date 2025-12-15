package ScenarioBased;
import java.util.Scanner;
public class speedlimit {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int sp=s.nextInt();
        if(sp>=100)
        {
    
            System.out.println("over speeding!Fine imposed");
        }
        else{
            System.out.println("speed is with limit");
        }
}
}
