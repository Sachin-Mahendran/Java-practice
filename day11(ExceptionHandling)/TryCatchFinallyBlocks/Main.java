package TryCatchFinallyBlocks;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int arr[]=new int[5];

        try{
            //the code which might raise an exception
            System.out.println(a/b);
            System.out.println(arr[6]);
        }
        catch(ArithmeticException e)
        {
            //code used to handle exception raised by try block
            System.out.println("can't divide");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("no more size");
        }
        //optional{
        finally{// code block of definite executable  statements
        //no matters exception raised or not
            System.out.println("This blocks always runs");
        }//}
    }
    
}