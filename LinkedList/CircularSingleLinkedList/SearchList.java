package LinkedList.CircularSingleLinkedList;

public class SearchList {
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


	boolean search(int value){
        Node temp = tail;
        for(int i=0;i<size;i++) {
            if(temp.value==value)
                return true;
            temp = temp.next;
        }
        return false;
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

class TestCT08
{
	public static void main(String[] args)
	{
		SearchList list = new SearchList();
		list.addTail(111);
		list.addTail(222);
		list.addTail(333);
		list.addTail(444);
		list.print();
		System.out.println("Search 333: "+list.search(333));
		System.out.println("Search 999: "+list.search(999));
	}
}
