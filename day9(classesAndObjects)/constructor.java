class Addition
{
    int a,b;
    Addition(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void add()
    {
        System.out.println(a+b);
    }
}
class Subtraction extends Addition {
    Subtraction(int a,int b)
    {
        super(a,b);
    }
        void sub()
        {
            System.out.println(a-b);
        }
}
public class constructor {
    public static void main(String[] args) {
        Subtraction s=new Subtraction(10, 20);
        s.add();
        s.sub();
    } 
}
