package LinkedList.SingleLinkedList;

public class DeleteLast {
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


	void deleteLast(){
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		if(head.next==null){
			head=null;
			return;
		}
		size--;
		Node temp1=head,temp2=head.next;
		while(temp2.next!=null){
			temp2 = temp2.next;
			temp1 = temp1.next;
		}
		temp1.next = null;
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

class Test10
{
	public static void main(String[] args)
	{
		DeleteLast list = new DeleteLast();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		list.printList();
		list.deleteLast();
		list.printList();
	}
}