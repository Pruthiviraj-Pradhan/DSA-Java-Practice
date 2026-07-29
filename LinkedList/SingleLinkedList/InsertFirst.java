package LinkedList.SingleLinkedList;

public class InsertFirst 
{
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


	void addFirst(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
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

class Test01
{
	public static void main(String[] args)
	{
		InsertFirst list = new InsertFirst();
		list.addFirst(111);
		list.addFirst(222);
		list.addFirst(333);
		list.addFirst(444);
		list.printList();
	}
}