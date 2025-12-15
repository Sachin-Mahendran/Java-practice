package ScenarioBased;
import java.util.Scanner;
public class datausageindicater {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        double da=s.nextDouble();
        double us=s.nextDouble();
        if(us<=da/2)
        {
    
            System.out.println("half consumed");
        }
        
        else if(us>da/2&&us<da)
        {
            System.out.println("low data");
        }
        else{
            System.out.println("data over ");
        }
}
}
