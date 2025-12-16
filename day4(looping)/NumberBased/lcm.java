import java.util.Scanner;
public class lcm {
    public static void main(String[]args)
    {
        Scanner st=new Scanner(System.in);
        int n=st.nextInt();
        int m=st.nextInt();
        int x=n,y=m;
        while(y!=0)
        {
           int r=x%y;
           x=y;
           y=r;
        }
        int lcm=(n*m)/x;
        System.out.println(lcm);
    }
}
