package ScenarioBased;

import java.util.Scanner;

public class electricitybill {
        public static void main(String []args){
    Scanner s=new Scanner(System.in);
        double u=s.nextInt();
        if(u>0&&u<=100)
        {
            System.out.println(u*0+"free");
        }
        else if(u>100&&u<=300)
        {
            System.out.println(u*5);
        }
        else if(u>300&&u<=500)
        {
            System.out.println(u*10);
        }
        else 
        {
            System.out.println(u*20);
        }
}
}
