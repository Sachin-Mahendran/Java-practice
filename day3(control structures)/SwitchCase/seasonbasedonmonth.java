package SwitchCase;
import java.util.*;
public class seasonbasedonmonth {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int mon=s.nextInt();
    switch(mon)
        {
            case 12:
                case 1:
                    case 2:
                    System.out.println("Winter");break;
            case 3:
                case 4:
                    case 5:
                    System.out.println("summer");break;
            case 6:
                case 7:
                    case 8:
                    System.out.println("Atumn");break;
            case 9:
                case 10:
                    case 11:
                    System.out.println("monsoon");break;
            default:
                System.out.println("invalid month");

        }
}
}