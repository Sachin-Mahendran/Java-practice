package InsertAtBegining;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}
class Linked{
    Node head;
    Linked()
    {
        head=null;
    }
    void InsertAtBegi(int val)
    {
        Node newNode=new Node(val);
        newNode.data=val;
        newNode.next=head;//current node address contains head this changes the head every time 
        head=newNode;//head should have the current node 
    }
    void display()
    {
        if(head==null)
        {
            System.out.print("empty list");
            return;
        }
        Node temp=head;
        System.out.print(" null ");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Linked l=new Linked();
        int n;
        Scanner s=new Scanner (System.in);
        do{
            n=s.nextInt();
            if(n>0)
            {
                l.InsertAtBegi(n);

            }
        }
        while(n>0);
        l.display();
    }
}