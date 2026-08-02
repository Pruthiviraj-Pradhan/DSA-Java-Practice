package LinkedList.CicularDoubleLinkedList;

public class RemoveHead {
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


	void addTail(int value) {
		Node newNode = new Node(value,null,null);
		if(size==0) {
			head = tail = newNode;
			newNode.next = newNode;
			newNode.prev = newNode;
		}
		else {
			newNode.next = tail.next;
			newNode.prev = tail;
			tail.next = newNode; 
			newNode.next.prev = newNode;
            tail = newNode; 
		}
		size++;
	}
	


	void removeHead() {
		if(size==0) {
			System.out.println("CDLL is empty");
			return;
		}
		size--;
		if(size==0) {
			head = null;
			tail = null;
			return;
		}
		Node temp = head.next;
		temp.prev = tail;
		tail.next = temp;
		head = temp;
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

class TestCD09
{
	public static void main(String[] args)
	{
		RemoveHead list = new RemoveHead();
		list.addTail(111);
		list.addTail(222);
		list.addTail(333);
		list.addTail(444);
		list.traverse();
		list.removeHead();
		list.traverse();
	}
}
