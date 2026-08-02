package LinkedList.CircularSingleLinkedList;

public class InsertHead {
    Node tail;
    int size = 0;
    class Node{
        int value;
        Node next;
        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    void addHead(int value){
        Node temp = new Node(value, null);
        if(size == 0){
            tail = temp;
            temp.next = temp;
        }
        else{
            temp.next = tail.next;
            tail.next = temp;
        }
        size ++;
    }


    void print(){
        if(size == 0){
            System.out.println("CSLL is empty");
            return;
        }
        Node temp = tail.next;
        while(temp!= tail){
            System.out.print(temp.value +" => ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
    class TestCT01{
        public static void main(String s[]){
            InsertHead list = new InsertHead();
            list.addHead(444);
            list.addHead(333);
            list.addHead(222);
            list.addHead(111);
            list.print();
        }
    }
}
