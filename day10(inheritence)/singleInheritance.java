import java.util.*;
 class Parent {
    void pprop()
    {
        System.out.print("parent");
    }
}
class Child extends Parent{
    void cprop()
    {
        System.out.println("children");
    }
}
public class singleInheritance{
    public static void main(String[] args) {
        Child c=new Child();
        c.cprop();
        c.pprop();
    }
}