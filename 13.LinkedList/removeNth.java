public class removeNth {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node Head;
    public Node Tail;
    public int Size = 0;

    public void AddFirst(int val) {
        Node newNode = new Node(val);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;
        Head = newNode;
    }

    public void AddLast(int val) {
        Node newNode = new Node(val);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        Tail = newNode;
    }

    public void AddMiddle(int val, int pos) {

        if (pos == 0) {
            AddFirst(val);
            return;
        }

        if (pos >= Size) {
            AddLast(val);
            return;
        }

        Node newNode = new Node(val);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        Node temp = Head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst() {
        if (Head == null) {
            System.out.println("LinkedList is Empty !");
            return;
        }

        Size--;
        Head = Head.next;
    }

    public int removeLast() {
        if (Size == 0) {
            System.out.println("LinkedList is Empty !");
            return 0;
        }

        if (Size == 1) {
            Size = 0;
            int data = Head.val;
            Head = Tail = null;
            return data;
        }

        Node temp = Head;
        for (int i = 0; i < Size - 2; i++) {
            temp = temp.next;
        }

        int data = Tail.val;
        temp.next = null;
        Tail = temp;
        Size--;
        return data;
    }

    public int removeMiddle(int pos) {

        if (Size == 0) {
            System.out.println("LinkedList is Empty !");
            return 0;
        } else if (Size == 1) {
            Size = 0;
            int data = Head.val;
            Head = Tail = null;
            return data;
        }

        if (pos == 0) {
            removeFirst();
        }

        if (pos >= Size) {
            removeLast();
        }

        Node temp = Head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        int data = temp.next.val;
        temp.next = temp.next.next;
        Size--;
        return data;
    }

    public int searchLL(int data) {
        Node temp = Head;
        int i = 0;
        while (temp != null) {
            if (temp.val == data) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public int SizeOfLL() {
        Node temp = Head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }

        return i;
    }

    public void removeNthLast(int pos) {
        Node temp = Head;

        int removePos = Size - pos;
        for (int i = 1; i < removePos; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public void printAll() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.err.print("null");
    }

    public static void main(String args[]) {
        removeNth LL = new removeNth();
        LL.AddFirst(5);
        LL.AddFirst(4);
        LL.AddFirst(3);
        LL.AddFirst(2);
        LL.AddFirst(1);
        // System.out.println(LL.SizeOfLL());
        LL.removeNthLast(3);
        LL.printAll();
    }
}
