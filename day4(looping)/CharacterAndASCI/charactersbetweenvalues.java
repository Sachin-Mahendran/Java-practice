package CharacterAndASCI;
import java.util.*;
public class charactersbetweenvalues {
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int st=s.nextInt();
        int en=s.nextInt();
        for (int i=st;i<=en;i++) {
            char ch=(char)i;
            System.out.println(ch);
        }
    }
}
