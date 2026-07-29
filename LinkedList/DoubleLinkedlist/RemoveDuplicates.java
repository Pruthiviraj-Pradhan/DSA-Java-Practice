package LinkedList.DoubleLinkedlist;

public class RemoveDuplicates {
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
	void removeDuplicates() {
		Node currNode = head, temp;
		while(currNode!=null) {
			if(currNode.next!=null && currNode.data == currNode.next.data)
			{
				currNode.next = currNode.next.next;
				temp = currNode.next;
				if(temp!=null)
					temp.prev = currNode;
			}
			else
				currNode = currNode.next;
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

class TestD14
{
	public static void main(String[] args)
	{
		// Note: removeDuplicates() assumes a SORTED list
		// (it only checks immediate neighbors)
		RemoveDuplicates list1 = new RemoveDuplicates();
		list1.addLast(111);
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(333);
		list1.addLast(333);
		list1.addLast(444);
		list1.traverse();
		list1.removeDuplicates();
		System.out.println("After removing duplicates:");
		list1.traverse();
	}
}