public class DoublyLL {
    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public Node Head;
    public Node Tail;
    public int Size;

    public void AddFirst(int val) {
        Node newNode = new Node(val);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;
    }

    public void AddLast(int val) {
        Node newNode = new Node(val);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
        }

        Tail.next = newNode;
        newNode.prev = Tail;
        Tail = newNode;
    }

    public void AddMiddle(int val, int pos) {

        if (pos == 1) {
            AddFirst(val);
            return;
        }

        if (pos >= Size) {
            AddLast(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = Head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
        newNode.prev = temp;

    }

    public void removeFirst() {

        if (Head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (Size == 1) {
            Size = 0;
            Head = Tail = null;
        }

        Head = Head.next;
        Head.prev = null;
        Size--;
    }

    public void removeLast() {

        if (Head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (Size == 1) {
            Size = 0;
            Head = Tail = null;
        }

        Tail = Tail.prev;
        Tail.next = null;
        Size--;
    }

    public void RemoveMiddle(int pos) {
        if (Head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (pos == 1) {
            removeFirst();
            return;
        }

        if (pos >= Size) {
            removeLast();
            return;
        }

        Node temp = Head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.next.prev = temp;
        Size--;
    }

    public void printAll() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String args[]) {
        DoublyLL ll = new DoublyLL();
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        // ll.removeFirst();
        // ll.removeFirst();
        ll.AddLast(5);
        ll.AddLast(6);
        // ll.removeLast();
        // ll.removeLast();
        ll.AddMiddle(7, 4);
        ll.printAll();
        ll.RemoveMiddle(4);
        ll.printAll();
        ll.removeFirst();
        ll.printAll();
        ll.removeLast();
        ll.printAll();
    }
}
