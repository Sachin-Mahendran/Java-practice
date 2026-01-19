package InsertAtEnd;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val){
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
    void insertAtEnd(int val)
    {
        Node newNode=new Node(val);
        newNode.data=val;
        newNode.next=null;
        if(head==null)
        {
            head=newNode;/*this holds the memory address of the newNode 
            ex:if memory address of newNode=1000 then head stores 1000*/
            return;
        }
        Node temp=head;//which is 1000
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;//stores the memory of newNode to access the newNode
    }
        void display(){
            if(head==null)
            {
                System.out.println("empty");
            }
            Node temp=head;
            while(temp!=null)//if the temp's next is not null the loop continues
            {
                System.out.print(temp.data+" ");
                temp=temp.next;//traversing the nodes from head to tail element .temp contains the next value
            }
            System.out.print("null");
        }
    
}
public class Main{
    public static void main(String[] args) {
        Linked l=new Linked();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e;
        for(int i=0;i<n;i++)
        {
            e=s.nextInt();
            l.insertAtEnd(e);
        }
        l.display();
    }
}