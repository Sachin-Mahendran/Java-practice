import java.util.Scanner;

public class celsiustofarenheit {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        double c=s.nextInt();
        double f=(c*1.8)+32;
        System.out.println(f);

}
}