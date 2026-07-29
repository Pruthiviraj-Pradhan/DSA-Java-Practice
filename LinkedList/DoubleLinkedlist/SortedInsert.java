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
		SortedInsert ascList = new SortedInsert();
		ascList.sortedInsertAsc(300);
		ascList.sortedInsertAsc(100);
		ascList.sortedInsertAsc(500);
		ascList.sortedInsertAsc(200);
		System.out.println("Ascending:");
		ascList.traverse();

		SortedInsert descList = new SortedInsert();
		descList.sortedInsertDesc(300);
		descList.sortedInsertDesc(100);
		descList.sortedInsertDesc(500);
		descList.sortedInsertDesc(200);
		System.out.println("Descending:");
		descList.traverse();
	}
}
