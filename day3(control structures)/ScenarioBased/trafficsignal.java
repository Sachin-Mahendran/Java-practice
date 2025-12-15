package ScenarioBased;

import java.util.Scanner;

public class trafficsignal {
    public static void main(String[]args)
    {
        Scanner s=new  Scanner(System.in);
        String ch=s.nextLine();
            if(ch=="red"||ch=="Red")
                    System.out.println("Stop");
            else if(ch=="yellow"||ch=="Yellow")
                    System.out.println("Ready");
            else if(ch=="Green"||ch=="green")
                    System.out.println("Go");
            else{
                System.out.println("Invalid light");
            }
        
}
}