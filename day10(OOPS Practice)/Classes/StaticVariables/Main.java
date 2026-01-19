package Classes.StaticVariables;
import java.util.*;
class Student{
    static int id;
    static String name;
    static double marks;
    static void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        Student.id=s.nextInt();
        s.nextLine();
        Student.name=s.nextLine();
        Student.marks=s.nextDouble();
        Student.display();
    }
}
