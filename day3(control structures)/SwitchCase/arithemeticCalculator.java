package SwitchCase;
import java.util.*;
public class arithemeticCalculator {
    public static void main(String[]args)
    {
        Scanner s=new  Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        char ch=s.next().charAt(0);
        switch (ch) {
           case '+'->
            System.out.println(a+b);
           case '-'->
            System.out.println(a-b); 
           case '*'->
            System.out.println(a*b); 
           case '/'->
            System.out.println(a/b); 
           case '%'->
            System.out.println(a%b); 
           default->
            System.out.println("Invalid"); 
        }
    }
}
