import java.util.Scanner;
public class marksofsubjects {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int p=s.nextInt();
        int c=s.nextInt();
        int cs=s.nextInt();
        int b=s.nextInt();
        System.out.print("Maths->"+m+"\n");
        System.out.print("Physics->"+p+"\n");
        System.out.print("Chemistry->"+c+"\n");
        System.out.print("Computer science->"+cs+"\n");
        System.out.print("Biology->"+b+"\n");
    }
}
