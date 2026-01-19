package Classes.AccessSpecifiers.Public;
import  java.util.*;
class Teachers{
    public String name;
    void display()
    {
        System.out.print(name);
    }
}
class Students extends Teachers{
    
    Students()
    {
        name="";
    }
    void display()
    {
        System.out.println("My teacher's name is "+name);
    }
}
public class Main {
    public static void main(String[] args) {
        Students s=new Students();
        Scanner sc=new Scanner(System.in);
        s.name=sc.nextLine();
        s.display();
    }
}
