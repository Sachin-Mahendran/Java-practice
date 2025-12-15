package ScenarioBased;

import java.util.Scanner;

public class wheathercondition {
     public static void main(String[]args)
    {
        Scanner s=new  Scanner(System.in);
        double t=s.nextDouble();
            if(t>=22&&t<=30){
                    System.out.println("Pleasent");}
            else if(t>=0&t<=18)
                    System.out.println("cold");
            else if(t>=30&&t<=45)
                    System.out.println("hot");
            else{
                System.out.println("heatwave");
            }
        
}
}
