package LinkedList.DoubleLinkedlist;

public class CompareLists {
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
	boolean compareListI(CompareLists list) {
		Node head1=head,head2=list.head;
		while(head1!=null && head2!=null) {
			if(head1.data!=head2.data)
				return false;
			head1 = head1.next;
			head2 = head2.next;
		}
		if(head1==null && head2==null)
			return true;
		return false;
	}
	boolean compareListR(CompareLists list) {
		return compareList(head,list.head);
	}
	boolean compareList(Node head1,Node head2) {
		if(head1==null && head2==null)
			return true;
		else if(head1==null || head2==null || (head1.data!=head2.data))
			return false;
		else
			return compareList(head1.next,head2.next);
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

class TestD17
{
	public static void main(String[] args)
	{
		CompareLists list1 = new CompareLists();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);

		CompareLists list2 = new CompareLists();
		list2.addLast(111);
		list2.addLast(222);
		list2.addLast(333);

		CompareLists list3 = new CompareLists();
		list3.addLast(111);
		list3.addLast(999);

		System.out.println("list1 == list2 (iterative)? "+list1.compareListI(list2));
		System.out.println("list1 == list3 (iterative)? "+list1.compareListI(list3));
		System.out.println("list1 == list2 (recursive)? "+list1.compareListR(list2));
		System.out.println("list1 == list3 (recursive)? "+list1.compareListR(list3));
	}
}