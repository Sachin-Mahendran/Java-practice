import java.util.*;
public class dateofbirth {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int m=s.nextInt();
        int y=s.nextInt();
        System.out.printf("%02d/%02d/%02d",d,m,y);
    }
}
