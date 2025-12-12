import java.util.*;
public class mangoesdiscount {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int a=s.nextInt();
        int dis=m/3;
        int sm=(m-dis)*a;
        System.out.println(sm);
    }
}
