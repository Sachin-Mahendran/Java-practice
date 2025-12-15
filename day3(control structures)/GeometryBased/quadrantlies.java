package GeometryBased;
import java.util.Scanner;
public class quadrantlies {
     public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        if(x>=0&&y>=0)
        {
            System.out.println("1st quadrant");
        }
        else if(x<0&&y>=0)
        {
            System.out.println("2nd quadrant");
        }
        else if(x<0&&y<0)
        {
            System.out.println("3rd quadrant");
        }
        else 
        {
            System.out.println("4th quadrant");}
    }
}
