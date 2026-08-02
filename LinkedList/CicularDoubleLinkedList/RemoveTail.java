package LinkedList.CicularDoubleLinkedList;

public class RemoveTail {
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
	


	void removeTail() {
		if(size==0) {
			System.out.println("CDLL is empty");
			return;
		}
		size--;
		if(size==0) {
			head=null;
			tail=null;
			return;
		}
		Node temp = tail.prev;
		temp.next = head;
		head.prev = temp;
		tail = temp;
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

class TestCD10
{
	public static void main(String[] args)
	{
		RemoveTail list1 = new RemoveTail();
		list1.addTail(111);
		list1.addTail(222);
		list1.addTail(333);
		list1.addTail(444);
		list1.traverse();
		list1.removeTail();
		list1.traverse();
	}
}
