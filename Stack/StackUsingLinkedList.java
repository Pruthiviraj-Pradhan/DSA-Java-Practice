
public class StackUsingLinkedList
{
    Node head = null;
    int size = 0;
    class Node{
        int value;
        Node next;
        Node(int value, Node next){
            this.value = value;
            this.next =next;
        }
    }
    int getSize(){
        return this.size;
    }
    boolean isEmpty(){
        return size == 0;
    }


    void print(){
        Node temp = head;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    void push(int value){
        head = new Node(value, head);
        size++;
    }


    int peek(){
        if(isEmpty())
            return - 1;
        else
            return head.value;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        else{
            int temp = head.value;
            head = head.next;
            return temp;
        }
    }
    public static void main(String args[]){
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(111);
        s.push(222);
        s.push(333); 
        s.push(444); 
        s.print(); 
        System.out.println(s.peek());
        System.out.println(s.pop());//444 
        System.out.println(s.pop());//333 
        s.print();

    }
}
