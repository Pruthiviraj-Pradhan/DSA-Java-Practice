package LinkedList.CircularSingleLinkedList;

public class InsertAtPosition {
	Node tail;
	int size = 0;
	class Node{
		int value;
		Node next;
		Node(int value,Node next){
			this.value = value;
			this.next = next;
		}
	}
	

	void addPos(int pos,int value) {
		Node newNode = new Node(value,null);
		if(size==0) {
			tail = newNode;
			newNode.next = newNode;
		}
		else {
			if(pos==0) {
				Node temp = tail.next;
				newNode.next = temp;
				tail.next = newNode;
				size++;
				return;
			}
			Node temp = tail.next;
			int i=0;
			while(temp.next!=tail && i<pos-1){
				temp = temp.next;
				i++;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			if(temp==tail)
				tail = newNode;
		}
		size++;
	}


	void print() {
		if(size==0) {
			System.out.println("CSLL is empty");
			return;
		}
		Node temp = tail.next;
		while(temp!=tail) {
			System.out.print(temp.value+" => ");
			temp=temp.next;
		}
		System.out.println(temp.value);
	}
}

class TestCT03
{
	public static void main(String[] args)
	{
		InsertAtPosition list = new InsertAtPosition();
		list.addPos(0,444);
		list.addPos(0,333);
		list.addPos(0,222);
		list.addPos(0,111);
		list.print();
		list.addPos(2,999);
		list.print();
		// insert at the very end (pos == size)
		list.addPos(5,777);
		list.print();
	}
}
