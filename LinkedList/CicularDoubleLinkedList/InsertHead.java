package LinkedList.CicularDoubleLinkedList;

public class InsertHead {

   Node head = null;
    Node tail = null;
    int size = 0;
    class Node{
        int value;
        Node next,prev;
        Node(int value,Node next,Node prev){
            this.value = value; 
            this.next = next; 
            this.prev = prev;
        }
    }
	

	void addHead(int value) {
		Node newNode = new Node(value,null,null);
		if(size==0) {
			tail = head = newNode;
			newNode.next = newNode;
			newNode.prev = newNode;
		}
		else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev = newNode;
			newNode.prev.next = newNode;
			head = newNode;
		}
		size++;
	}
	

	void traverse() {
		if(size==0) {
			System.out.println("CDLL is empty");
			return;
		}
		Node temp = tail.next;
        while(temp!=tail) {
            System.out.print(temp.value+" ==> ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
}

class TestCD01
{
	public static void main(String[] args)
	{
		InsertHead list = new InsertHead();
		list.addHead(444);
		list.addHead(333);
		list.addHead(222);
		list.addHead(111);
		list.traverse();
	}
}