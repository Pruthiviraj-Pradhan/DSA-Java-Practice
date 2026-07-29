package LinkedList.SingleLinkedList;

public class CompareList {
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

//Iterative Method
	boolean compareList1(CompareList list){
		Node head1=head,head2=list.head;
		while(head1!=null && head2!=null){
			if(head1.data!=head2.data)
				return false;
			head1=head1.next;
			head2=head2.next;
		}
		if(head1==null && head2==null)
			return true;
		return false;
	}

//Recursive method
	boolean compareList2(CompareList list){
		return compareList(head,list.head);
	}
	boolean compareList(Node head1,Node head2){
		if(head1==null && head2==null)
			return true;
		else if(head1==null || head2==null || (head1.data!=head2.data))
			return false;
		else
			return compareList(head1.next,head2.next);
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

class Test17
{
	public static void main(String[] args)
	{
		CompareList list1 = new CompareList();
		list1.addLast(111);
		list1.addLast(222);
		list1.addLast(333);

		CompareList list2 = new CompareList();
		list2.addLast(111);
		list2.addLast(222);
		list2.addLast(333);

		CompareList list3 = new CompareList();
		list3.addLast(111);
		list3.addLast(999);

		System.out.println("list1 == list2 (iterative)? "+list1.compareList1(list2));
		System.out.println("list1 == list3 (iterative)? "+list1.compareList1(list3));
		System.out.println("list1 == list2 (recursive)? "+list1.compareList2(list2));
		System.out.println("list1 == list3 (recursive)? "+list1.compareList2(list3));
	}
}
