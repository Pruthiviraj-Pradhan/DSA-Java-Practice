package LinkedList;

class LL
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }    
   }

//Insertion at begining
   void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
   }

//Insertion at ending
   void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node temp = head;
    while(temp.next!= null)
        temp = temp.next;
    temp.next = newNode;
   }

//printing statement
   void printList(){
    if(head == null)
    {
        System.out.println("list is empty");
        return;
    }
    Node temp = head;
    while(temp!=null)
    {
        System.out.print(temp.data+"=> ");
        temp = temp.next;
    }
    System.out.println("NULL");
   }

//Delete node from begining
   void deleteFirst(){
    if(head == null)
    {
        System.out.println("list is empty");
        return;
    }
    head = head.next;
   }

//Delete node from ending
   void deleteLast(){
    if(head == null)
    {
        System.out.println("list is empty");
        return;
    }
    if(head.next == null){
        head = null;
        return;
    }
    Node temp1,temp2;
    temp1 = head;
    temp2 = head.next;
    while(temp2.next!=null){
        temp2 = temp2.next;
        temp1 = temp1.next;
    }
    temp1.next = null;
   }
}


public class Basics {
    public static void main(String s[]){
        LL list = new LL();
        list.addFirst(333);
        list.addFirst(222);
        list.addFirst(111);
        list.addLast(444); 
        list.addLast(555); 
        list.addLast(666); 
        list.printList();        //111=>222=>333=>444=>555=>666=>NULL 
        list.deleteFirst();
        list.deleteFirst();
        list.printList();    //333=>444=>555=>666=>NULL
        list.deleteLast();
        list.deleteLast();
        list.printList();    //333=>444=>NULL 
    }
}
