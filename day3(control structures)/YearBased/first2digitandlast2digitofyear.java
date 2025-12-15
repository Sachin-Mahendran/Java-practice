package YearBased;
import java.util.*;
public class first2digitandlast2digitofyear {
     public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a/100==a%100)
    {
        System.out.println("equal");
    }
    else
    {
        System.out.println("not equal");
    }
}
}
