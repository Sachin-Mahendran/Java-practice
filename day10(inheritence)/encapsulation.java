import java.util.*;
 class Addition {
    private int a,b;
    Addition(int a,int b)
    //wraping the private data member with other parameters
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.print(a+b);
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Addition p=new Addition(10,20);
        p.display();;
    }
}
