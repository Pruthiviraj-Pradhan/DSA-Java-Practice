package LinkedList.SingleLinkedList;

public class DeleteAtPosition {
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
	void deleteElementAtPos(int pos){
		Node temp = head;
		int i=0;
		if(temp==null){
			System.out.println("empty");
			return;
		}
		if(pos==0){
			head = head.next;
			size--;
			return;
		}
		while(temp.next!=null && i<pos){
			if(i==pos-1){
				temp.next = temp.next.next;
				size--;
				return;
			}
			i++;
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

class Test11
{
	public static void main(String[] args)
	{
		DeleteAtPosition list1 = new DeleteAtPosition();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);
		list1.addLast(444);
		list1.printList();
		list1.deleteElementAtPos(2);
		list1.printList();
	}
}