class Addition {//same code act as many forms
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,double b)
    {
        System.out.println(a+b);
    }
    void add(double a,int b)
    {
        System.out.println(a+b);
    }
    void add(double a,double b)
    {
        System.out.println(a+b);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Addition a=new Addition();
        a.add(10,20);
        a.add(10.0, 20.0);
        a.add(10.0,20);
        a.add(10,20.0);
    }
}
