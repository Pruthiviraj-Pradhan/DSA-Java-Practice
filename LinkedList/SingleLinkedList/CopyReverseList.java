package LinkedList.SingleLinkedList;

public class CopyReverseList {
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
	CopyReverseList copyReversedList(){
		Node temp1=null,temp2=null,currNode=head;
		while(currNode!=null){
			temp2 = new Node(currNode.data,temp1);
			currNode = currNode.next;
			temp1 = temp2;
		}
		CopyReverseList obj = new CopyReverseList();
		obj.head = temp1;
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

class Test15
{
	public static void main(String[] args)
	{
		CopyReverseList list = new CopyReverseList();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		System.out.println("Original:");
		list.printList();

		CopyReverseList reversedCopy = list.copyReversedList();
		System.out.println("Reversed copy:");
		reversedCopy.printList();

		System.out.println("Original is unchanged:");
		list.printList();
	}
}