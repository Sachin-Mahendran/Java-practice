package Classes.Constructor.ParametrizedConstructor;
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
        Scanner s=new Scanner(System.in);
        int id=s.nextInt();
        s.nextLine();
        String name=s.nextLine();
        Student st=new Student(id,name);
        st.display();
    }
}
