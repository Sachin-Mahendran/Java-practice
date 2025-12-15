package SwitchCase;
import java.util.*;
public class gradeorfail {
    public static void main(String[]args)
    {
        Scanner s=new  Scanner(System.in);
        int a=s.nextInt();
        int c=a/10;
        switch(c)
        {
            case 10:
                case 9:
                    System.out.println("A");break;
            case 8:
                case 7:
                    System.out.println("B");break;
            case 6:
                case 5:
                    System.out.println("c");break;
            default:
                System.out.println("Fail");

        }
}
}