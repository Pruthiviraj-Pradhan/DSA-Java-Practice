package LinkedList.DoubleLinkedlist;

public class NthNode {
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

	int getSize() {
		return this.size;
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


	int nthNodeFromBegin(int index) {
		if(index>getSize() || index<1)
			return -1;
		int count=0;
		Node currNode = head;
		while(currNode!=null && count<index-1) {
			count++;
			currNode = currNode.next;
		}
		return currNode.data;
	}

	int nthNodeFromEnd(int index) {
		int size = getSize();
		int sindex;
		if(size!=0 && size<index)
			return -1;
		sindex = size-index+1;
		return nthNodeFromBegin(sindex);
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

class TestD18
{
	public static void main(String[] args)
	{
		NthNode list = new NthNode();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		list.addLast(555);
		list.addLast(666);
		list.addLast(777);
		list.addLast(888);
		list.traverse();
		System.out.println(list.nthNodeFromBegin(3));
		System.out.println(list.nthNodeFromEnd(3));
	}
}