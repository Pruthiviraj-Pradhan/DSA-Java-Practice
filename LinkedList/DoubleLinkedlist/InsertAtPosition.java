package LinkedList.DoubleLinkedlist;

public class InsertAtPosition {
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


	void addPos(int data,int pos) {
		int i=0;
		if(pos<0 || pos>=size) {
			System.out.println("out of range");
			return;
		}
		Node newNode = new Node(data,null,null);
		if(head==null) {
			head = newNode;
			return;
		}
		if(pos!=0) {
			Node currNode = head, temp = null;
			while(currNode.next!=null && i<pos) {
				temp = currNode;
				currNode = currNode.next;
				i++;
			}
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = currNode;
			currNode.prev = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
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

class TestD03
{
	public static void main(String[] args)
	{
		InsertAtPosition list = new InsertAtPosition();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		list.traverse();
		list.addPos(999,2);
		list.traverse();
	}
}