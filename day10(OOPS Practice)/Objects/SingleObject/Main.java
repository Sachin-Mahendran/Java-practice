package Objects.SingleObject;
import java.util.*;
class Student{
    int id;
    String name;
    double marks;
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }
}
public class Main{
    public static void main(String[] args) {
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        s.id=sc.nextInt();
        sc.nextLine();
        s.name=sc.nextLine();
        s.marks=sc.nextDouble();
        s.display();
    }
}