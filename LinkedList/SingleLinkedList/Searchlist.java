package LinkedList.SingleLinkedList;

public class Searchlist {
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
	boolean search(int data){
		Node currNode = head;
		while(currNode!=null){
			if(currNode.data == data)
				return true;
			currNode = currNode.next;
		}
		return false;
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

class Test08
{
	public static void main(String[] args)
	{
		Searchlist list1 = new Searchlist();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(444);
		list1.printList();
		System.out.println("Search 333: "+list1.search(333));
		System.out.println("Search 999: "+list1.search(999));
	}
}
