package LinkedList.SingleLinkedList;

public class ReverseList {
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
	void reverse(){
		Node curr = head, prev=null,next=null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	void reverseR(){
		head = reverseRUtil(head,null);
	}
	Node reverseRUtil(Node currNode, Node nextNode){
		Node res;
		if(currNode==null)
			return null;
		if(currNode.next==null){
			currNode.next = nextNode;
			return currNode;
		}
		res = reverseRUtil(currNode.next,currNode);
		currNode.next = nextNode;
		return res;
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

class Test07
{
	public static void main(String[] args)
	{
		ReverseList list = new ReverseList();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(444);
		System.out.println("Original:");
		list.printList();

		list.reverse();
		System.out.println("After iterative reverse():");
		list.printList();

		list.reverseR();
		System.out.println("After recursive reverseR():");
		list.printList();
	}
}