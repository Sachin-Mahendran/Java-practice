package NumberBased;
import java.util.*;
public class ifnumberis1digit2digitor3digit {
      public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    
    if(a>=0&&a<10)
    {
        System.out.println("Single digit");
    }
    else if(a>=10&&a<100)
    {
        System.out.println("two digit");
    }
    else if(a>=100&&a<1000)
    {
        System.out.println("three digit");
    }
    else
    {
        System.out.println("more than three digit");
    }

}
}
