package DeletionAtEnd;

import java.util.Scanner;

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
    Linked(){
        head=null;
    }
    void insertAtEnd(int val)
    {
        Node newNode=new Node(val);
        newNode.data=val;
        newNode.next=null;
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void deleteAtEnd(){
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        else if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;;
        }
        temp.next=null;
    }
        void display()
        {
            if(head==null)
            {
                System.out.println("list is empty");
                return;
            }
            Node  temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Linked l=new Linked();
        int t=0;
        do
        {
            t=s.nextInt();
            if(t!=-1)
            l.insertAtEnd(t);

        }
        while(t!=-1);
        l.display();
        l.deleteAtEnd();
        l.display();
    }
}
