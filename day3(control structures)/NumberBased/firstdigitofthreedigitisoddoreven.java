package NumberBased;
import java.util.*;
public class firstdigitofthreedigitisoddoreven {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=a/100;
    if(a>=100&&a<1000)
    {
        if(b%2==0)
        System.out.println("even");
    
    else
    {
        System.out.println("odd");
    }
}
    else{
        System.out.println("not 3 digit number");}
}
}
