abstract class Addition {
    int a,b;
    Addition(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    abstract void add();
    void multiply()
    {
        System.out.println(a*b);
    }
    
}
class Subtraction extends Addition {
    Subtraction(int a,int b){
        super(a, b);
    }
    void add()
    {
        System.out.println(a+b);
    }
}
public class abstractClass {
    public static void main(String[] args) {
        Subtraction s=new Subtraction(30, 20);
        s.add();
        s.multiply();
        
    }
}
