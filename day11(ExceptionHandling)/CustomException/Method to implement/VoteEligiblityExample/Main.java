
import java.util.*;
class Eligibility extends Exception{
    Eligibility(String message){
        super(message);
    }
}
public class Main {
    static void check (int a)throws Eligibility{
        if(a<18)
        {
            throw new Eligibility("Not eligible to vote");
        }
        System.out.println("eligible to vote");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        try{
            check(a);
        }
        catch(Eligibility e){
            System.out.println(e.getMessage());
        }
    }
    
}
