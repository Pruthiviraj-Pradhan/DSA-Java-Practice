package LinkedList.DoubleLinkedlist;

public class CopyReverseList {
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
	CopyReverseList copyReversedList() {
		Node temp1=null,temp2=null,currNode=head;
		while(currNode!=null) {
			temp2=new Node(currNode.data,temp1,null);
			currNode = currNode.next;
			if(temp1!=null)
				temp1.prev = temp2;
			temp1 = temp2;
		}
		CopyReverseList obj = new CopyReverseList();
		obj.head = temp1;
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

class TestD15
{
	public static void main(String[] args)
	{
		CopyReverseList list1 = new CopyReverseList();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(444);
		System.out.println("Original:");
		list1.traverse();

		CopyReverseList reversedCopy = list1.copyReversedList();
		System.out.println("Reversed copy:");
		reversedCopy.traverse();

		System.out.println("Original is unchanged:");
		list1.traverse();
	}
}
