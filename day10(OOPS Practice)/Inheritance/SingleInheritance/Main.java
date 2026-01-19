package Inheritance.SingleInheritance;

import java.util.Scanner;

class Teachers{
    String name;
    int id;
    int roll_no;
    void display()
    {
        System.out.println(id+" "+roll_no+" "+name);
    }
}
class Student extends Teachers{
    Student ()
    {
        id=0;
        name="";
        roll_no=0;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+roll_no);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        Scanner sc=new Scanner (System.in);
        s.id=sc.nextInt();
        sc.nextLine();
        s.name=sc.nextLine();
        s.roll_no=sc.nextInt();
        s.display();
    }
}
