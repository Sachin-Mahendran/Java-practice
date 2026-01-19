class stu {
    static int i=2;
    static float m=100;

static void display()//void should implemented in static object method
{
    System.out.print(i+" "+m);
}
}
public class staticofObject{//static property
    public static void main(String[] args) {
        System.out.println(stu.m);//directly accesing with the clss name
        stu.display();

    }
}