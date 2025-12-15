package NumberBased;
import java.util.*;
public class sumoftwonumberisoddoreven {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=a+b;
    if((c%2)==0)
    {
        System.out.println("even");
    }
    else
    {
        System.out.println("odd");
    }
}
}
