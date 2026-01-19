package Classes.Constructor.DefaultConstructor;
import java.util.*;
class Student{
    int id;
    String name;
    Student ()
    {
        id=0;
        name="";
    }
    void display()
    {
        System.out.println(id+" "+name);
    }

}
public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        Scanner sc=new Scanner (System.in);
        s.id=sc.nextInt();
        sc.nextLine();
        s.name=sc.nextLine();
        s.display();
    }
}
