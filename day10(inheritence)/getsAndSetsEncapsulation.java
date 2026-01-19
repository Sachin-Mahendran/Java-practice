import java.util.*;
 class Addition {
    private int a,b;
    int getA()
    {
        return a;
    }
    int getB()
    {
        return b;
    }
    void setAB(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.print(a+b);
    }
}

public class getsAndSetsEncapsulation{
    public static void main(String[] args) {
        Addition p=new Addition();
        p.setAB(80,90);
        p.display();;
    }
}
