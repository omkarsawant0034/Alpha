//SinglyLL

public class LinkedList {
    
    public class  Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int Size;
    
    //AddFirst
    public void AddFirst(int data){
        Node newNode = new Node(data);
        Size++;
        if(Head == null){
            Head = Tail = newNode;
            return; 
        }
        newNode.next = Head;
        Head = newNode;
    }

    //AddLast
    public void AddLast(int data){
        Node newNode = new Node(data);
        Size++;
        if(Head == null){
            Head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        Tail = newNode;

        /*  Node temp = Head;
            while(temp.next != null){
                 temp = temp.next;
            }
        
            temp.next = newNode;
        */

    }

    //AddMiddle
    public void AddMiddle(int data,int pos){
        //Insert First
        if(pos == 0){
            AddFirst(data);
            return;
        }
        
        //Insert Last
        if(pos >= Size){
            AddLast(data);
            return;
        }

        Node newNode = new Node(data);
        Size++;
        Node prev = Head;
        int i = 0;

        while(i < pos-1){
            prev = prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    //Print and Count Nodes
    public void PrintLL(){
        int Count = 0;
        if(Head == null){
            System.out.println("LinkedList is empty !");
            return;
        }
        Node temp = Head;
        while(temp != null){
            System.out.print("|"+temp.data+"|->"+" ");
            temp = temp.next;
            Count++; 
        }
        System.out.print("|NULL|");
        System.out.println();
        System.out.println("Number of nodes : "+Count);
    }

    // Remove First
    public int RemoveFirst(){
        if(Size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(Size == 1){
            int val = Head.data;
            Size = 0;
            Head = Tail = null;
            return val;
        }

        int val = Head.data;
        Head = Head.next;
        Size--;
        return val;
    }

    // Remove Last 
    public int RemoveLast(){
        if(Size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(Size == 1){
            int val = Head.data;
            Size = 0;
            Head = Tail = null;
            return  val;
        }

        Node prev = Head;
        for(int i = 0; i < Size-2; i++){
            prev = prev.next;
        }
        int val = Tail.data; // prev.next.data
        prev.next = null;
        Tail = prev;
        Size--;
        return val;
    }
    //Remove At Pos
    public void RemoveMiddle(int pos){
        if( Size < 0 || pos >= Size){
            System.out.println("Invalid Position");
            return;
        }
        
        if(pos == 0){
            RemoveFirst();
            return;
        }
        if(pos == Size-1){
            RemoveLast();
            return;
        }

        Node temp = Head;
        int i = 0;
        while(i < pos-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        Size--;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.AddFirst(2);
        ll.AddFirst(1);
        // ll.PrintLL();

        ll.AddLast(3);
        ll.AddLast(4);
        // ll.PrintLL();

        ll.AddMiddle(5, 2);
        ll.AddMiddle(6, 3);
        ll.AddMiddle(7, 7);
        ll.PrintLL();

        
        
        ll.RemoveFirst();
        ll.PrintLL();
        
        ll.RemoveLast();
        ll.PrintLL();

        ll.RemoveMiddle(2);
        ll.PrintLL();
    }
}
 