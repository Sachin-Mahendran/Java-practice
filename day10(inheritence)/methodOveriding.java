class Parent{
    void display()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void display()
    {
        System.out.println("child");
    }
    void cprop()
    {
        System.out.println("child propertirs");
    }
}
public class methodOveriding {
    public static void main(String[] args) {
        Parent p=new Child();//upcasting object for parent using memory of child class
        p.display();
        Child c=(Child)p;//downcasting(or)typecasting
        c.cprop();
    }
}
