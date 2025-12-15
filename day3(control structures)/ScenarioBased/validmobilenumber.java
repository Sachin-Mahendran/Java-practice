package ScenarioBased;
import java.util.*;
public class validmobilenumber {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        long nu=s.nextLong();
        if(nu>=1000000000L&&nu<=9999999999L)
        {
    
            System.out.println("Valid mobile number");
        }
        else{
            System.out.println("not valid number");
        }
}
}