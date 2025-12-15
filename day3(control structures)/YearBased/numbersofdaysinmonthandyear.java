package YearBased;
import java.util.Scanner;
public class numbersofdaysinmonthandyear {
   public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int m=s.nextInt();
    if(a%4!=0)
    {
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        {
            System.out.println("31");
        }
        else if(m==2)
        {
            System.out.println("28");
        }
    }
    else if(a%4==0)
    {
        if(m==2)
        {
            System.out.println("29");
        }
    }
    }
}
