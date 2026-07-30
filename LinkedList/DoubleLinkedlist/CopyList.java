package LinkedList.DoubleLinkedlist;

public class CopyList {
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


	CopyList copyList() {
		Node headNode=null,tailNode=null,tempNode=null,currNode=head;
		if(currNode==null)
			return null;
		headNode = new Node(currNode.data,null,null);
		tailNode = headNode;
		currNode = currNode.next;
		while(currNode!=null) {
			tempNode = new Node(currNode.data,null,null);
			tailNode.next = tempNode;
			tempNode.prev = tailNode;
			tailNode = tempNode;
			currNode = currNode.next;
		}
		CopyList obj = new CopyList();
		obj.head = headNode;
		return obj;
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

class TestD16
{
	public static void main(String[] args)
	{
		CopyList list = new CopyList();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		System.out.println("Original:");
		list.traverse();

		CopyList copy = list.copyList();
		System.out.println("Copy (same order):");
		copy.traverse();
	}
}