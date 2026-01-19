import java.util.*;
 class Parent {
    void pprop()
    {
        System.out.println("parent");
    }
}
class Child1 extends Parent{
    void child1()
    {
        System.out.println("children 1");
    }
}
class Child2 extends Parent  {
    void child2()
    {
        System.out.println("children 2");
    }
}
class Child3 extends Parent  {
    void child3()
    {
        System.out.println("children 3");
    }
}
public class heira {
        public static void main(String[] args) {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        c1.pprop();
        c1.child1();
        c2.child2();
        c2.pprop();
    }
}
