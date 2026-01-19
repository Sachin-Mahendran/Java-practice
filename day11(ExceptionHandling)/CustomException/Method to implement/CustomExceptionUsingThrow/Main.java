import java .util.*;
class NegativeNumberException extends Exception{
    NegativeNumberException(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        try{
            if(a<0)
            {
                throw new NegativeNumberException(("Number is negative"));
            }
            System.out.println(a);
        }
        catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
