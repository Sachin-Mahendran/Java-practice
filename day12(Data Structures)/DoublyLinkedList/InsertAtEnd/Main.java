package DoublyLinkedList.InsertAtEnd;
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
    void insertBegining(int val)
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
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        
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
            dl.insertBegining(t);}
        }
        while(t>0);
        dl.displayForward();
        
    }
    
}