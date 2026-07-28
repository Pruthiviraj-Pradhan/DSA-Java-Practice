package LinkedList.SingleLinkedList;

public class DeleteElement {
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
	void deleteElement(int data){
		Node temp = head;
		if(temp==null){
			System.out.println("empty");
			return;
		}
		if(temp.data == data){
			head = head.next;
			size--;
			return;
		}
		while(temp.next!=null){
			if(temp.next.data == data){
				temp.next = temp.next.next;
				size--;
				return;
			}
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

class Test12
{
	public static void main(String[] args)
	{
		DeleteElement list = new DeleteElement();
		list.addLast(111);
		list.addLast(222);
		list.addLast(333);
		list.addLast(222);
		list.addLast(444);
		list.printList();
		list.deleteElement(222);
		System.out.println("After deleting first occurrence of 222:");
		list.printList();
	}
}