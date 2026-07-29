package LinkedList.DoubleLinkedlist;

public class DeleteElements {
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
	void deleteElements(int data) {
		Node temp1 = head, temp2;
		if(temp1==null) {
			System.out.println("DLL empty");
			return;
		}
		if(temp1.data == data) {
			head = head.next;
			if(head!=null)
				head.prev = null;
			size--;
		}
		while(temp1.next!=null)
		{
			if(temp1.next.data == data) {
				temp1.next = temp1.next.next;
				temp2 = temp1.next;
				if(temp2!=null)
					temp2.prev = temp1;
				size--;
			}
			if(temp1.next!=null)
				temp1 = temp1.next;
		}  
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

class TestD13
{
	public static void main(String[] args)
	{
		DeleteElements list1 = new DeleteElements();
		list1.addLast(222);
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(222);
		list1.traverse();
		list1.deleteElements(222);
		System.out.println("After deleting all occurrences of 222:");
		list1.traverse();
	}
}