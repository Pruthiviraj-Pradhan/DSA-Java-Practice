package LinkedList.DoubleLinkedlist;

public class DeleteFirst {
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
	void deleteFirst() {
		if(head==null) {
			System.out.println("DLL is empty");
			return;
		}
		size--;
		head = head.next;
		if(head!=null)
			head.prev = null;
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

class TestD09
{
	public static void main(String[] args)
	{
		DeleteFirst list1 = new DeleteFirst();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(444);
		list1.traverse();
		list1.deleteFirst();
		list1.traverse();
	}
}