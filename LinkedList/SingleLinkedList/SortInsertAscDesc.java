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
		SortInsertAscDesc ascList = new SortInsertAscDesc();
		ascList.sortedInsertAsc(300);
		ascList.sortedInsertAsc(100);
		ascList.sortedInsertAsc(500);
		ascList.sortedInsertAsc(200);
		System.out.println("Ascending:");
		ascList.printList();

		SortInsertAscDesc descList = new SortInsertAscDesc();
		descList.sortedInsertDesc(300);
		descList.sortedInsertDesc(100);
		descList.sortedInsertDesc(500);
		descList.sortedInsertDesc(200);
		System.out.println("Descending:");
		descList.printList();
	}
}
