import java.util.Scanner;

public class SinglyLL {
    
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    
    public SinglyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // AddFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return; 
        }
        newNode.next = head;
        head = newNode;
    }

    // AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // AddMiddle
    public void addMiddle(int data, int pos){
        if (pos < 0 || pos > size) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 0) {
            addFirst(data);
            return;
        }
        if (pos == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    // Print and Count Nodes
    public void printList(){
        if (head == null) {
            System.out.println("LinkedList is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("|" + temp.data + "|-> ");
            temp = temp.next;
        }
        System.out.print("|NULL|");
        System.out.println();
        System.out.println("Number of nodes: " + size);
    }

    // Remove First
    public int removeFirst(){
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return val;
    }

    // Remove Last 
    public int removeLast(){
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Remove at Position
    public void removeMiddle(int pos){
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 0) {
            removeFirst();
            return;
        }
        if (pos == size - 1) {
            removeLast();
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ENTER YOUR CHOICE: ");
            System.out.println("Enter 1: Add Node at First");
            System.out.println("Enter 2: Add Node at Last");
            System.out.println("Enter 3: Add Node at Position");
            System.out.println("Enter 4: Delete Node From First");
            System.out.println("Enter 5: Delete Node From Last");
            System.out.println("Enter 6: Delete Node From Position");
            System.out.println("Enter 7: Print all Nodes");
            System.out.println("Enter 8: Exit");
        
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Data to Insert: ");
                    int data1 = sc.nextInt();
                    addFirst(data1);
                    break;
                case 2:
                    System.out.println("Enter Data to Insert: ");
                    int data2 = sc.nextInt();
                    addLast(data2);
                    break;
                case 3:
                    System.out.println("Enter Data to Insert: ");
                    int data3 = sc.nextInt();
                    System.out.println("Enter Position to Insert: ");
                    int pos = sc.nextInt();
                    addMiddle(data3, pos);
                    break;
                case 4:
                    removeFirst();
                    break;
                case 5:
                    removeLast();
                    break;
                case 6:
                    System.out.println("Enter the Position to Delete: ");
                    int pos1 = sc.nextInt();
                    removeMiddle(pos1);
                    break;
                case 7:
                    printList();
                    break;
                case 8:
                    System.out.println("******** EXITED FROM LL ********");
                    sc.close();
                    return;
                default:
                    System.out.println("******** ENTER VALID CASE ********!!");
                    System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.display();
    }
}
