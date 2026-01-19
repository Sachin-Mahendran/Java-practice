interface Addition {//interface or multiple iinheritance
    abstract void add();
    abstract void multiply();
    
}
class Subtraction implements Addition{
    int a,b;
    Subtraction(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        System.out.println(a+b);
    }
    public void multiply()
    {
        System.out.println(a*b);
    }
}
public class interFaceExample {
    public static void main(String[] args) {
        Subtraction s=new Subtraction(10, 20);
        s.add();
        s.multiply();
    }
    
}
