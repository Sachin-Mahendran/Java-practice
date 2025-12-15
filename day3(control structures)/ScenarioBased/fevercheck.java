package ScenarioBased;

import java.util.Scanner;

public class fevercheck {
     public static void main(String []args){
    Scanner s=new Scanner(System.in);
        double b=s.nextInt();
        if(b>=100)
        {
            System.out.println("fever");
        }
        else
        {
            System.out.println("u r ok");
        }
       
}
}
