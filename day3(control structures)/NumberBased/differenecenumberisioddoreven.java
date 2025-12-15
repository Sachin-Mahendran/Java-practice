package NumberBased;
import java.util.*;
public class differenecenumberisioddoreven {
      public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=a-b;
    if((a-b)%2==0)
    {
        System.out.println("even");
    }
    else
    {
        System.out.println("odd");
    }
}
}
