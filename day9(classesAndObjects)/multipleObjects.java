class st {
    int i;
    float m;
    void display()
    {
        System.out.println(i+" "+m);
        System.out.println();
    }
}
public class multipleObjects {
    public static void main(String[] args) {
        st s1=new st();//object creation (class name obj name=new constructor();)
        s1.i=1;
        s1.m=100;
        s1.display();
        st s2=new st();//object creation (class name obj name=new constructor();)
        s2.i=2;
        s2.m=200;
        s2.display();
        st s3=new st();//object creation (class name obj name=new constructor();)
        s3.i=3;
        s3.m=300;
        s3.display();
    }
}
