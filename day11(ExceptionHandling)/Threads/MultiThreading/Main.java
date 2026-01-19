class Addition extends Thread{
    int a=10,b=20;
    public void run(){
        System.out.println(a+b);
    }
}
class Subtraction extends Thread{
    int a=10,b=20;
    public void run(){
        System.out.println(a-b);
    }
}
class Multiplication extends Thread{
    int a=10,b=30;
    public void run()
    {
        System.out.println(a*b);
    }
}
public class Main {
    public static void main(String[] args) {
        Addition ad=new Addition();
        Subtraction su=new Subtraction();
        Multiplication mu=new Multiplication();
        ad.start();
        su.start();
        mu.start();
    }
}
