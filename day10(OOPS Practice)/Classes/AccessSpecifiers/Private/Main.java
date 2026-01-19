package Classes.AccessSpecifiers.Private;
import java.util.*;
class Teachers{
    private double salary;
    Teachers(double salary)
    {
        this.salary=salary;//this keyword define the private variable
    }
    void display()
    {
        System.out.println(salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        double salary=s.nextDouble();
        Teachers t=new Teachers(salary);
        t.display();
    }
}
