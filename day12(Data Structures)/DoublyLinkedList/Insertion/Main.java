package DoublyLinkedList.Insertion;
import java.util.*;
class Node{
    int data;
    Node next,prev;
    Node(int val)
    {
        data=val;
        next=null;
        prev=null;
    }
}
class Doubly{
    Node head;
    Doubly()
    {
        head=null;
    }
    void insertAtEnd(int val)
    {
        Node newNode=new Node(val);
        newNode.data=val;
        newNode.next=null;
        newNode.prev=null;
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
        newNode.prev=temp;
        }
        void displayForward()
        {
            if(head==null)
            {
                System.out.print("list is empty");
                return;
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayBacward(){
            if (head==null){
                System.out.print("list is empty");
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }
            System.out.println();
        }
}
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        Doubly dl=new Doubly();
        int t=0;
        do{
            t=s.nextInt();
            if(t>0){
            dl.insertAtEnd(t);}
        }
        while(t>0);
        dl.displayForward();
        dl.displayBacward();
    }
    
}