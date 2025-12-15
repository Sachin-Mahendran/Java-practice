package ScenarioBased;
import java.util.Scanner;
public class batterypercentage {
    public static void main(String []args){
    Scanner s=new Scanner(System.in);
        double b=s.nextInt();
        if(b<=20)
        {
            System.out.println("Low BAttery");
        }
        else if(b<=50)
        {
            System.out.println("50% consumed");
        }
        else
        {
            System.out.println("Battery Full");
        }
}
}
