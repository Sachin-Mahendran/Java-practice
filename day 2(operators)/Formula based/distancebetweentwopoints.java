import java.util.Scanner;
public class distancebetweentwopoints {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x1=s.nextDouble();
        double x2=s.nextDouble();
        double y1=s.nextDouble();
        double y2=s.nextDouble();
        double d=((x2-x1)*(x2-1))+((y2-y1)*(y2-y1));
        System.out.println("distance between two points->"+d);
        }
}