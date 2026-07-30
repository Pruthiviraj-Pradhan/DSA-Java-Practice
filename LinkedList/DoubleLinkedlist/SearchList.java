package LinkedList.DoubleLinkedlist;

public class SearchList {
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


	boolean search(int data) {
		Node temp = head;
		while(temp!=null) {
			if(temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
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

class TestD08
{
	public static void main(String[] args)
	{
		SearchList list = new SearchList();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		list.traverse();
		System.out.println("Search 333: "+list.search(333));
		System.out.println("Search 999: "+list.search(999));
	}
}