package LinkedList.DoubleLinkedlist;

public class DeleteLast {
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


	void addLast(int data) {
		Node newNode = new Node(data,null,null);
		if(head==null)
			head = newNode;
		else {
			Node currNode = head;
			while(currNode.next != null)
				currNode = currNode.next;
			currNode.next = newNode;
			newNode.prev = currNode;
		}
	}


	void deleteLast() {
		if(head==null) {
			System.out.println("DLL is empty");
			return;
		}
		if(head.next == null) {
			head = null;
			size--;
			return;
		}
		size--;
		Node temp1 = head, temp2 = head.next;
		while(temp2.next!=null) {
			temp2 = temp2.next;
			temp1 = temp1.next;
		}
		temp1.next = null;
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

class TestD10
{
	public static void main(String[] args)
	{
		DeleteLast list = new DeleteLast();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		list.traverse();
		list.deleteLast();
		list.traverse();
	}
}