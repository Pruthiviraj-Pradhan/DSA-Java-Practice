package LinkedList.SingleLinkedList;

public class RemoveDuplicates {
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
	void removeDuplicates(){
		Node currNode = head;
		while(currNode!=null){
			if(currNode.next!=null && currNode.data == currNode.next.data)
				currNode.next = currNode.next.next;
			else
				currNode = currNode.next;
		}
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

class Test14
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
		list1.printList();
		list1.removeDuplicates();
		System.out.println("After removing duplicates:");
		list1.printList();
	}
}