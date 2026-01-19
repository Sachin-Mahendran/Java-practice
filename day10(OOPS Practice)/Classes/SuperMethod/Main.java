package Classes.SuperMethod;
import java.util.*;
class Teachers{
    int n=10;
    Teachers()//parent constructor
    {
        System.out.println("Teachers Constructor");
    }
    void display()//parent method
    {
        System.out.println(n+" Teachers are working");
    }
}
class Students extends Teachers{
    int n;
    Students()
    {
        super();//calling the parent constructor using super keyword
    }
    void display()
    {
        super.display();//calling the parent method using super keyword.parent_mathod_name
    }
}
public class Main {
    public static void main(String[] args) {
    Students s=new Students();
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    s.display();
    }
}
