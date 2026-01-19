package Objects.MultipleObjects;
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
public class Main {
    public static void main(String[] args) {
        Student st=new Student();
        Scanner s=new Scanner(System.in);
        st.id=s.nextInt();
        s.nextLine();
        st.name=s.nextLine();
        st.marks=s.nextDouble();
        Student st2=new Student();
        st2.id=s.nextInt();
        s.nextLine();
        st2.name=s.nextLine();
        st2.marks=s.nextDouble();
        st.display();
        st2.display();

        
       /*  Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            Student st=new Student();
            st.id=s.nextInt();
            s.nextLine();
            st.name=s.nextLine();
            st.marks=s.nextDouble();
            st.display();
        }*/
        

    }
}
