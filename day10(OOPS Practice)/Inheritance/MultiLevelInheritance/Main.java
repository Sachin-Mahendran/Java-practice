package Inheritance.MultiLevelInheritance;
import java.util.*;
class Teachers{
    String name;
    int id;
    int roll_no;
    void display()
    {
        System.out.println(id+" "+roll_no+" "+name);
    }
}
class Student extends Teachers{
    Student ()
    {
        id=0;
        name="";
        roll_no=0;
    }
   
}
class Parents extends Teachers
{
    Parents()
    {
        super();
    }
    void display()
    {
        System.out.println("parent of "+name);
        super.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Parents s=new Parents();
        Scanner sc=new Scanner (System.in);
        s.id=sc.nextInt();
        sc.nextLine();
        s.name=sc.nextLine();
        s.roll_no=sc.nextInt();
        s.display();
    }
}
