package LinkedList.CircularSingleLinkedList;

public class DeleteElement {
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


	void removeHead(){
		if(size==0){
			System.out.println("CSLL is empty");
			return;
		}
		if(tail.next==tail){
			tail = null;
			size--;
			return;
		}
		tail.next = tail.next.next;
		size--;
	}


	void deleteElement(int value){
		if(size==0){
			System.out.println("CSLL is empty");
			return;
		}
        Node prev=tail,currNode=tail.next,head=tail.next;
        
        if(currNode.value==value){
            if(currNode==currNode.next)
                tail = null;
            else
                tail.next = tail.next.next;
            return;
        }
        prev = currNode;
        currNode = currNode.next;
        while(currNode!=head) {
            if(currNode.value == value) {
                if(currNode==tail)
                    tail = prev;
                prev.next = currNode.next;
                return;
            }
            prev = currNode;
            currNode = currNode.next;
        }
        return; 
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

class TestCT12
{
	public static void main(String[] args)
	{
		DeleteElement list = new DeleteElement();
		list.addTail(111);
		list.addTail(222);
		list.addTail(333);
		list.addTail(222);
		list.addTail(444);
		list.print();
		list.deleteElement(222);
		System.out.println("After deleting first occurrence of 222:");
		list.print();
	}
}
