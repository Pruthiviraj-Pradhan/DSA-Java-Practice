package LinkedList.SingleLinkedList;

public class DeleteFirst {
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


	void deleteFirst(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		size--;
		head=head.next;
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

class Test09
{
	public static void main(String[] args)
	{
		DeleteFirst list = new DeleteFirst();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		list.printList();
		list.deleteFirst();
		list.printList();
	}
}