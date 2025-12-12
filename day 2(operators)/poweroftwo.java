import java.util.*;
public class poweroftwo{
public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println((((a)&(a-1))==0)?"yes":"no");

    }
}