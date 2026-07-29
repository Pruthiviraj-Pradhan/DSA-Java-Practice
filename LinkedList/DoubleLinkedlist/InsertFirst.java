package LinkedList.DoubleLinkedlist;

public class InsertFirst {
	Node head;
	int size = 0;
	class Node{
		int data;
		Node next,prev;
		Node(int data,Node next,Node prev){
			this.data = data;
			this.next = next;
			this.prev = prev;
			size++;
		}
	}


	void addFirst(int data) {
		Node newNode = new Node(data,null,null);
		if(head==null)
			head = newNode;
		else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

    
	void traverse() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+" => ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
}

class TestD01
{
	public static void main(String[] args)
	{
		InsertFirst list = new InsertFirst();
		list.addFirst(111);
		list.addFirst(222);
		list.addFirst(333);
		list.addFirst(444);
		list.traverse();
	}
}