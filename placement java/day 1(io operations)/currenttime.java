import java.util.*;
public class currenttime {
    public static void main(String[]args){
    Scanner st=new Scanner(System.in);
        int h=st.nextInt();
        int m=st.nextInt();
        int s=st.nextInt();
        System.out.printf("%02d:%02d:%02d",h,m,s);
}
}