package LinkedList.SingleLinkedList;

public class InserAtPosition {
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

	void addPos(int data,int pos){
		int i=0;
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return;
		}
		if(pos!=0){
			Node currNode = head;
			Node prevNode = null;
			while(currNode.next!=null && i<pos){
				prevNode = currNode;
				currNode = currNode.next;
				i++;
			}
			prevNode.next = newNode;
			newNode.next = currNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
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

class Test03
{
	public static void main(String[] args)
	{
		InserAtPosition list1 = new InserAtPosition();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(444);
		list1.printList();
		list1.addPos(999,2);
		list1.printList();
	}
}
