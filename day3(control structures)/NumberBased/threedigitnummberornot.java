package NumberBased;
import java.util.Scanner;
public class threedigitnummberornot {
    
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a>=100&&a<1000)
    {
        System.out.println("yes three digit");
    }
    else
    {
        System.out.println("no three digit");
    }
}
}
