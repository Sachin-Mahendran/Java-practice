package SwitchCase;
import java.util.Scanner;
public class weekendorweekdays {
    public static void main(String[]args)
    {
        Scanner s=new  Scanner(System.in);
        int a=s.nextInt();
        switch(a)
        {
            case 1:
                    System.out.println("weekend:sunday");break;
            case 2:
                    System.out.println("weekdays:Monday");break;
            case 3:
                    System.out.println("weekdays:Tuesday");break;
            case 4:
                    System.out.println("weekdays:Wednesday");break;
            case 5:
                    System.out.println("weekdays:Thursday");break;
            case 6:
                    System.out.println("weekdays:Friday");break;
            case 7:
                    System.out.println("weekend:Saturday");break;
            default:
                System.out.println("invalid day");

        }
}
}
