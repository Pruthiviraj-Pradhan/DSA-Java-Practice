package LinkedList.DoubleLinkedlist;

public class ReverseList {
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
	void reverse() {
		Node temp=null,currNode=head;
		while(currNode!=null) {
			temp = currNode.prev;
			currNode.prev = currNode.next;
			currNode.next = temp;
			currNode= currNode.prev;
		}
		if(temp!=null)
			head = temp.prev;
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

class TestD07
{
	public static void main(String[] args)
	{
		ReverseList list1 = new ReverseList();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(444);
		System.out.println("Original:");
		list1.traverse();
		list1.reverse();
		System.out.println("Reversed:");
		list1.traverse();
	}
}