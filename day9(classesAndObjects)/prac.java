class st {
    int i=2;
    float m=100;
    void display()
    {
        System.out.println(i+" "+m);
    }
}
public class prac{
    public static void main(String[] args) {
        st s=new st();//object creation (class name obj name=new constructor();)
        System.out.println(s.m);//accessing class using object
        s.display();
    }
}