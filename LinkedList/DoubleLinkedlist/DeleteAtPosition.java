package LinkedList.DoubleLinkedlist;

public class DeleteAtPosition {
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


	void deleteElementAtPos(int pos) {
		Node temp1 = head, temp2;
		int i=0;
		if(temp1==null) {
			System.out.println("DLL is empty");
			return;
		}
		if(pos<0 || pos>=size) {
			System.out.println("out of range");
			return;
		}
		if(pos==0) {
			head = head.next;
			if(head!=null)
				head.prev = null;
			size--;
			return;
		}
		while(temp1.next!=null && i<pos) {
			if(i==pos-1) {
				temp1.next = temp1.next.next;
				temp2 = temp1.next;
				if(temp2!=null)
					temp2.prev = temp1;
				size--;
				return;    
			}
			i++;
			temp1 = temp1.next;
			temp2 = temp1.next;
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

class TestD11
{
	public static void main(String[] args)
	{
		DeleteAtPosition list = new DeleteAtPosition();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		list.traverse();
		list.deleteElementAtPos(2);
		list.traverse();
	}
}