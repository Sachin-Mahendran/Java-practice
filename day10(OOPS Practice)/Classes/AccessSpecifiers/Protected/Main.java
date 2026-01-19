package Classes.AccessSpecifiers.Protected;
import java.util.*;
class Teachers{
    protected double salary;
    Teachers(double salary)
    {
        this.salary=salary;
    }
    void display()
    {
        System.out.println(salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double salary=s.nextDouble();
        Teachers t=new Teachers(salary);
        t.display();
    }
}
