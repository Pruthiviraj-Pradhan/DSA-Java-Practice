public class ToStringForStack
{
    Node head = null;
    int size = 0;
    class Node{
        int value;
        Node next;
        Node(int value, Node next){
            this.value = value;
            this.next =next;
        }
    }

    int getSize(){
        return this.size;
    }
    boolean isEmpty(){
        return size == 0;
    }


    void print(){
        Node temp = head;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb.insert(0, temp.value+" ");
            temp = temp.next;
        }
        System.out.println(sb.toString());
    }


    void push(int value){
        head = new Node(value, head);
        size++;
    }


    int peek(){
        if(isEmpty())
            return - 1;
        else
            return head.value;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        else{
            int temp = head.value;
            head = head.next;
            return temp;
        }
    }

    public String toString(){
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb.insert(0, temp.value+" , ");
            temp = temp.next;
        }
        if(sb.length() > 0)
            sb.delete(sb.length()-3, sb.length());
        sb.insert(0, "[");
        sb.append("]");
        return sb.toString();
    }
    public static void main(String args[]){
        ToStringForStack s = new ToStringForStack();
        s.push(111);
        s.push(222);
        s.push(333); 
        s.push(444); 
        s.print(); 
        System.out.println(s);
    }
}


/*public class ToStringForStack
{
    Node head = null;
    int size = 0;
    class Node{
        int value;
        Node next;
        Node(int value, Node next){
            this.value = value;
            this.next =next;
        }
    }

    int getSize(){
        return this.size;
    }
    boolean isEmpty(){
        return size == 0;
    }


    void print(){
        Node temp = head;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    void push(int value){
        head = new Node(value, head);
        size++;
    }


    int peek(){
        if(isEmpty())
            return - 1;
        else
            return head.value;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        else{
            int temp = head.value;
            head = head.next;
            return temp;
        }
    }

    
    public String toString(){
        Node temp = head;
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        while(temp!=null){
            if(temp.next!= null)
                sb.append(temp.value+" , ");
            else
                sb.append(temp.value);
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String args[]){
        ToStringForStack s = new ToStringForStack();
        s.push(111);
        s.push(222);
        s.push(333); 
        s.push(444); 
        s.print(); 
        System.out.println(s);
    }
}*/


