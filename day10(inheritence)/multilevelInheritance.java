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
class Child_2 extends Child  {
    void ccprop()
    {
        System.out.println("children");
    }
}
public class multilevelInheritance {
        public static void main(String[] args) {
        Child_2 c=new Child_2();
        c.cprop();
        c.pprop();
        c.ccprop();
    }
}
