package LinkedList.SingleLinkedList;

public class SortInsertAscDesc {
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
	
	
	void sortedInsertAsc(int data){
		Node newNode = new Node(data);
		Node currNode = head;
		if(currNode==null||currNode.data>data){
			newNode.next = head;
			head = newNode;
			return;
		}
		while(currNode.next!=null && currNode.next.data<data){
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
	}


	void sortedInsertDesc(int data){
		Node newNode = new Node(data);
		Node currNode = head;
		if(currNode==null||currNode.data<data){
			newNode.next = head;
			head = newNode;
			return;
		}
		while(currNode.next!=null && currNode.next.data>data){
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
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

class Test04
{
	public static void main(String[] args)
	{
		SortInsertAscDesc List1 = new SortInsertAscDesc();
		List1.sortedInsertAsc(300);
		List1.sortedInsertAsc(100);
		List1.sortedInsertAsc(500);
		List1.sortedInsertAsc(200);
		System.out.println("Ascending:");
		List1.printList();

		SortInsertAscDesc List2 = new SortInsertAscDesc();
		List2.sortedInsertDesc(300);
		List2.sortedInsertDesc(100);
		List2.sortedInsertDesc(500);
		List2.sortedInsertDesc(200);
		System.out.println("Descending:");
		List2.printList();
	}
}
