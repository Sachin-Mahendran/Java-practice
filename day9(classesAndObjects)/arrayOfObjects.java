import java.util.Scanner;
class st{
    int id;
    float marks;
    void display()
    {
        System.out.println(id+" "+marks);
        System.out.println();
    }
}
public class arrayOfObjects{//array of objects for access n number of objects
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        st su[]=new st[n];
        for(int i=0;i<n;i++)
        {
            int id=s.nextInt();
            float marks=s.nextFloat();
            su[i]=new st();
            su[i].id=id;
            su[i].marks=marks;
        }
        for(int i=0;i<n;i++)
        {
            su[i].display();
        }
    }
}
