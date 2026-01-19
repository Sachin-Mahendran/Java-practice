interface Parent1 {
    abstract void pprop1();
}
interface Parent2{
    abstract void pprop2();
}
class Child implements Parent1,Parent2{
    public void pprop1()
    {
        System.out.println("parent properties");
    }
    public void pprop2()
    {
        System.out.println("parent2 properties");
    }
    void childprop(){
        System.out.println("child propertes");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
    Child c=new Child();
    c.pprop1();
    c.pprop2();
    c.childprop();
    }
}
