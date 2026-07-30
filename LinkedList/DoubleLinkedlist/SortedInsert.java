package LinkedList.DoubleLinkedlist;

public class SortedInsert {
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


	void sortedInsertAsc(int data) {
		Node newNode = new Node(data,null,null);
		Node currNode = head;
		if(currNode==null) {
			head = newNode;
			return;
		}
		if(currNode.data>data) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}

		while(currNode.next!=null && currNode.next.data < data)
			currNode = currNode.next;

		if(currNode.next!=null) {
			newNode.next = currNode.next;
			currNode.next.prev = newNode;
			currNode.next = newNode;
			newNode.prev = currNode;
		}
		else {
			currNode.next = newNode;
			newNode.prev = currNode;
		}
	}


	void sortedInsertDesc(int data) {
		Node newNode = new Node(data,null,null);
		Node currNode = head;
		if(currNode==null) {
			head = newNode;
			return;
		}
		if(currNode.data<data) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}

		while(currNode.next!=null && currNode.next.data > data)
			currNode = currNode.next;

		if(currNode.next!=null) {
			newNode.next = currNode.next;
			currNode.next.prev = newNode;
			currNode.next = newNode;
			newNode.prev = currNode;
		}
		else {
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

class TestD04
{
	public static void main(String[] args)
	{
		SortedInsert List1 = new SortedInsert();
		List1.sortedInsertAsc(300);
		List1.sortedInsertAsc(100);
		List1.sortedInsertAsc(500);
		List1.sortedInsertAsc(200);
		System.out.println("Ascending:");
		List1.traverse();

		SortedInsert List2 = new SortedInsert();
		List2.sortedInsertDesc(300);
		List2.sortedInsertDesc(100);
		List2.sortedInsertDesc(500);
		List2.sortedInsertDesc(200);
		System.out.println("Descending:");
		List2.traverse();
	}
}
