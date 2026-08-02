package LinkedList.CircularSingleLinkedList;

public class InsertTail
{
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


	void addTail(int value) {
		Node temp = new Node(value,null);
		if(size==0) {
			tail = temp;
			temp.next = temp;
		}
		else {
			temp.next = tail.next;
			tail.next = temp;
			tail = temp;
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

class TestCT02
{
	public static void main(String[] args)
	{
		InsertTail list = new InsertTail();
		list.addTail(111);
		list.addTail(222);
		list.addTail(333);
		list.addTail(444);
		list.print();
	}
}