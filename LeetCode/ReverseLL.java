public class ReverseLL {
    
    class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int Size = 0; 

    public void AddFirst(int val){
        Node newNode = new Node(val);
        Size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int val){
        Node newNode = new Node(val);
        Size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = tail;      
        tail = newNode;
    } 

    public void AddMiddle(int val, int Pos){

        if(Pos == 1){
            AddFirst(val);
            return;
        }

        if(Pos >= Size){
            AddLast(val);
            return;
        }
        
        Node newNode = new Node(val);
        int i = 1;
        Node temp = head;
        while(i < Pos-1){   // 1 -> x-> 2 -> 3 -> 4 
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void ReverseList(){ // 1 -> 2 -> 3 -> 4 -> null
        Node curr = head;   
        Node prev = null;       
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void display(){

        if(head == null){
            System.out.println("LinkedList is empty !");
        }
        Node temp = head;
        while(temp != null){
            System.out.print("|"+temp.val+"|"+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]){
        ReverseLL ll = new ReverseLL();
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddMiddle(7,2);
        // ll.display();
        ll.ReverseList();
        ll.display();
    }
}
