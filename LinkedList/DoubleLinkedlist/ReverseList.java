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
		ReverseList list = new ReverseList();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		System.out.println("Original:");
		list.traverse();
		list.reverse();
		System.out.println("Reversed:");
		list.traverse();
	}
}