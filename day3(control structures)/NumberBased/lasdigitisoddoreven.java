package NumberBased;
import java.util.*;
public class lasdigitisoddoreven {
     public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=a%10;
    if(b%2==0)
    {
        System.out.println("even");
    }
    else
    {
        System.out.println("odd");
    }
}
}
