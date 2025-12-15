package NumberBased;
import java.util.*;
public class evenoroddusingbitwise {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if((a&1)==0)
    {
        System.out.println("even");
    }
    else
    {
        System.out.println("odd");
    }
}
}
