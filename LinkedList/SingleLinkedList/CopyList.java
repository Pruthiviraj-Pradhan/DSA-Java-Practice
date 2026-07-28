package LinkedList.SingleLinkedList;

public class CopyList {
	Node head;
	int size;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
		Node(int data,Node temp){
			this.data = data;
			this.next = temp;
			size++;
		}
	}
	void addLast(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null)
			currNode = currNode.next;
		currNode.next = newNode;
	}
	CopyList copyList(){
		Node headNode=null,tailNode=null,tempNode=null,currNode=head;
		if(currNode==null)
			return null;
		headNode = new Node(currNode.data,null);
		tailNode = headNode;
		currNode = currNode.next;
		while(currNode!=null){
			tempNode = new Node(currNode.data,null);
			tailNode.next = tempNode;
			tailNode = tempNode;
			currNode = currNode.next;
		}
		CopyList obj = new CopyList();
		obj.head = headNode;
		return obj;
	}
	void printList(){
		if(head==null){
			System.out.println("list is empty");
		}
		Node currNode = head;
		while(currNode!=null){
			System.out.print(currNode.data+" => ");
			currNode = currNode.next;
		}
		System.out.println("null");
	}
}

class Test16
{
	public static void main(String[] args)
	{
		CopyList list = new CopyList();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		System.out.println("Original:");
		list.printList();

		CopyList copy = list.copyList();
		System.out.println("Copy (same order):");
		copy.printList();
	}
}