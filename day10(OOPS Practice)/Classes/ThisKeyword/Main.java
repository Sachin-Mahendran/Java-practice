package Classes.ThisKeyword;
import java.util.*;
class Student{
    int id;
    String name;
    Student (int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        Student s=new Student(id,name);
        s.display();
    }
}
