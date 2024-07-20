//SinglyLL

import java.util.Scanner;

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

    public void Display(){
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE : ");
        System.out.println("Enter 1 : Add Node at First");
        System.out.println("Enter 2 : Add Node at Last");
        System.out.println("Enter 3 : Add Node at Position");
        System.out.println("Enter 4 : Delete Node From First");
        System.out.println("Enter 5 : Delete Node From Last");
        System.out.println("Enter 6 : Delete Node From Position");
        System.out.println("Enter 7 : Print all Nodes");
        System.out.println("Enter 8 : Exit");
        
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Data to Insert : ");
                int data1 = sc.nextInt();
                ll.AddFirst(data1);
                Display();
            case 2:
                System.out.println("Enter Data to Insert : ");
                int data2 = sc.nextInt();
                ll.AddLast(data2);
                Display();
            case 3:
                System.out.println("Enter Data to Insert : ");
                int data3 = sc.nextInt();
                System.out.println("Enter Position to Insert : ");
                int pos = sc.nextInt();
                ll.AddMiddle(data3, pos);
                Display();
            case 4:
                ll.RemoveFirst();
                Display();
            case 5:
                ll.RemoveLast();
                Display();
            case 6:
                System.out.println("Enter the Position to Insert : ");
                int pos1 = sc.nextInt();
                ll.RemoveMiddle(pos1);
                Display();
            case 7:
                ll.PrintLL();
                Display();
        
            case 8:
                System.out.println("******** EXITED FROM LL********");
                break;
            default :  
                System.out.println("******** ENTER VALID CASE ********!!");
                System.out.println();
                Display();
        }

        sc.close();
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Display();
        // ll.AddFirst(2);
        // ll.AddFirst(1);
        // ll.PrintLL();

        // ll.AddLast(3);
        // ll.AddLast(4);
        // ll.PrintLL();

        // ll.AddMiddle(5, 2);
        // ll.AddMiddle(6, 3);
        // ll.AddMiddle(7, 7);
        // ll.PrintLL();

        // ll.RemoveFirst();
        // ll.PrintLL();

        // ll.RemoveLast();
        // ll.PrintLL();

        // ll.RemoveMiddle(2);
        // ll.PrintLL();
    }
}
 