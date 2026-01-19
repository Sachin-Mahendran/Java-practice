package Objects.ArrayOfObjects;
import java.util.*;
class Student{
    int id;
    String name;
    double marks;
    void display()
    {
        System.out.println(id+" "+name+" "+marks);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Student st[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            int id=s.nextInt();
            s.nextLine();
            String name=s.nextLine();
            double marks=s.nextDouble();
            st[i]=new Student();
            st[i].id=id;
            st[i].name=name;
            st[i].marks=marks;
        }
        for(int i=0;i<n;i++)
        {
            st[i].display();
        }
    }
    
}
