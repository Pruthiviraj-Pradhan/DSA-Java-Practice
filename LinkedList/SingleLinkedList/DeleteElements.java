package LinkedList.SingleLinkedList;

public class DeleteElements {
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


	void deleteElements(int data){
		Node temp = head;
		if(temp==null){
			System.out.println("empty");
			return;
		}
		if(temp.data == data){
			head = head.next;
			size--;
		}
		while(temp.next!=null){
			if(temp.next.data == data){
				temp.next = temp.next.next;
				size--;
			}
			if(temp.next!=null)
				temp = temp.next;
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

class Test13
{
	public static void main(String[] args)
	{
		DeleteElements list = new DeleteElements();
		list.addLast(222);
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(222);
		list.printList();
		list.deleteElements(222);
		System.out.println("After deleting all occurrences of 222:");
		list.printList();
	}
}